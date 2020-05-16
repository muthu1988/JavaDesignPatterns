package behavioral.observer;

public class ObserverPattern {
	
	public static void main(String[] args) {
		
		System.out.println("Observer : Object that wishes to be informed about events happening in the system");
		Person person = new Person();
		System.out.println("Person object has Event which can return subscription by taking consumer as args");
		Event<PropertyChangesEventArgs>.Subscription subscription = person.event.addHandle((t) -> {
			System.out.println(t.propertyName  + " Value changed from " + t.oldValue + " to " + t.newValue);
		});
		person.setAge(12);
		person.setAge(13);
		subscription.close();
		System.out.println("No logs as we closed the subscription");
		person.setAge(14);
	}

}
