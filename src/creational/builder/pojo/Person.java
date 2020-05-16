package creational.builder.pojo;
public class Person {
	public String name;
	public int age;
	public String role;
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", role=" + role + "]";
	}
}