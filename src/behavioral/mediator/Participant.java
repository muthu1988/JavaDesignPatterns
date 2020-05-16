package behavioral.mediator;

public class Participant {

	public int value;
	
	Mediator mediator;

	public Participant(Mediator mediator) {
		this.mediator = mediator;
		mediator.addParticipant(this);
	}

	public void say(int n) {
		mediator.broadCast(this, n);
	}
}