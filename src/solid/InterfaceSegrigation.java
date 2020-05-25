package solid;

interface Bird {
	void eats();
	void fly();
	void flyingHeight();
}

interface Flightless extends Bird {
	void run();
	void speed();
}

interface BirdSegIntf {
	void eats();
}

interface FlightSegIntf {
	void fly();
	void flyingHeight();
}

interface FlightlessSegIntf {
	void run();
	void speed();
}

class Ostrich implements Flightless {
	@Override
	public void flyingHeight() { } // YAGNI
	@Override
	public void fly() {}	// YAGNI		
	@Override
	public void speed() {}
	@Override
	public void run() {}
	@Override
	public void eats() {}
}

class NewOstrich implements BirdSegIntf, FlightlessSegIntf {
	@Override
	public void run() {}
	@Override
	public void speed() {}
	@Override
	public void eats() {}
}


public class InterfaceSegrigation {
	
	public static void main(String[] args) {
		
		System.out.println("Interface Segrication Principle");
		Ostrich ostrich  = new Ostrich(); 
		System.out.println("Flightless implemetation doesn't need to implement fly and flyingHeight - YAGNI");
		System.out.println("Cerate segregated interface such that a client dont have to implemnt uncessary methods (YAGNI)");
		
		System.out.println("\nSrgregated Interface - for bird and flight");
		NewOstrich newOstrich = new NewOstrich();
		System.out.println("class NewOstrich extends bird and Flightless as two segregated interface");

	}
	
		

}

