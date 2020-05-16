package creational.builder.pojo;

public class NewPerson {
	public String name;
	public String address;
	public String state;
	public String city;
	public String job;
	public int salary;
	@Override
	public String toString() {
		return "NewPerson [name=" + name + ", address=" + address + ", state=" + state + ", city=" + city + ", job="
				+ job + ", salary=" + salary + "]";
	}
}