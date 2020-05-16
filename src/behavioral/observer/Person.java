package behavioral.observer;

public class Person {
	
	public Event<PropertyChangesEventArgs> event = new Event<>();
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(this.age == age) return;
		int oldVal = this.age;
		this.age = age;
		event.fire(new PropertyChangesEventArgs(this, "age", oldVal, age));
	}
	
	

}
