package creational.builder.fluentinterface;

import creational.builder.pojo.Person;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {
	protected Person person = new Person();
	public SELF name(String name) {
		person.name = name;
		return self();
	}
	public SELF age(int age) {
		person.age = age;
		return self();
	}
	public Person build() {
		return person;
	}
	public SELF self() {
		return (SELF) this;
	}
}
