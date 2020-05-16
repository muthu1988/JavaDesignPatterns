package behavioral.mediator;

public class MediatorPattern {
	
	public static void main(String[] args) {
		
		System.out.println("Mediator pattern - modifies other components, without having any direct reference to each other");
		Mediator mediator = new Mediator();
		Participant one = new Participant(mediator);
		Participant two = new Participant(mediator);
		Participant three = new Participant(mediator);
		one.say(1);two.say(2);three.say(3);
		for (Participant p : mediator.getParticipants()) {
			System.out.println(p.value);
		}
	}

}
