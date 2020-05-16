package structural.proxy.protection;

public class Driver {
	
	private int age;

	public Driver(int age) {
		this.setAge(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
