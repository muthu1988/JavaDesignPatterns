package behavioral.state;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineBuilder;
import org.springframework.statemachine.config.StateMachineBuilder.Builder;
import org.springframework.statemachine.state.State;
import org.springframework.statemachine.transition.Transition;

enum PhoneState {
	OFF_HOOK, // starting
	ON_HOOK, // terminal
	CONNECTING, CONNECTED, ON_HOLD
}

enum PhoneEvent {
	CALL_DIALED, HUNG_UP, CALL_CONNECTED, PLACED_ON_HOLD, TAKEN_OFF_HOLD, LEFT_MESSAGE, STOP_USING_PHONE
}

public class StateMachineSpring {

	public static StateMachine<PhoneState, PhoneEvent> buildStateMachine() throws Exception {

		Builder<PhoneState, PhoneEvent> builder = StateMachineBuilder.builder();

		// Initial state
		builder.configureStates().withStates().initial(PhoneState.OFF_HOOK).states(EnumSet.allOf(PhoneState.class));

		// All other transitions
		builder.configureTransitions()
			.withExternal().source(PhoneState.OFF_HOOK).event(PhoneEvent.CALL_DIALED).target(PhoneState.CONNECTED).and()
			.withExternal().source(PhoneState.OFF_HOOK).event(PhoneEvent.STOP_USING_PHONE).target(PhoneState.ON_HOOK).and()
			.withExternal().source(PhoneState.CONNECTING).event(PhoneEvent.HUNG_UP).target(PhoneState.OFF_HOOK).and()
			.withExternal().source(PhoneState.CONNECTING).event(PhoneEvent.CALL_CONNECTED).target(PhoneState.CONNECTED).and()
			.withExternal().source(PhoneState.CONNECTED).event(PhoneEvent.LEFT_MESSAGE).target(PhoneState.OFF_HOOK).and()
			.withExternal().source(PhoneState.CONNECTED).event(PhoneEvent.HUNG_UP).target(PhoneState.OFF_HOOK).and()
			.withExternal().source(PhoneState.CONNECTED).event(PhoneEvent.PLACED_ON_HOLD).target(PhoneState.OFF_HOOK).and()
			.withExternal().source(PhoneState.ON_HOLD).event(PhoneEvent.TAKEN_OFF_HOLD).target(PhoneState.CONNECTED).and()
			.withExternal().source(PhoneState.ON_HOLD).event(PhoneEvent.HUNG_UP).target(PhoneState.OFF_HOOK);
		
		return builder.build();
	}

	public static void main(String[] args) throws Exception {
		
		StateMachine<PhoneState, PhoneEvent> machine = buildStateMachine();
		machine.start();
		PhoneState exitState = PhoneState.ON_HOOK;

	    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
	    
	    while(true) {
	    	State<PhoneState, PhoneEvent> state = machine.getState();
	    	System.out.println("Phone is " + state.getId());
	    	System.out.println("Select something..");
	    	List<Transition<PhoneState, PhoneEvent>> trans = machine.getTransitions().stream().filter((t) -> t.getSource().equals(state)).collect(Collectors.toList());
	    	for (int i = 0; i < trans.size(); i++) {
				System.out.println(i + ". " + trans.get(i).getTrigger().getEvent());
			}
	    	int choice = 0;
	    	boolean properChoice = false;
	    	do {
				System.out.print("Enter a choice: ");
				try {
					choice = Integer.parseInt(console.readLine());
					properChoice = choice >= 0 && choice < trans.size(); 
				} catch(Exception e) {
					properChoice = false;
				}				
			} while (!properChoice);
	    	
	    	// perform the transition
	        machine.sendEvent(trans.get(choice).getTrigger().getEvent());
	        if (machine.getState().getId() == exitState) break;
	    	
	    }
	    System.out.println("we are done!");
	}

}

