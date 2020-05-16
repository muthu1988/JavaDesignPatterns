package creational.builder.fluent;

import creational.builder.pojo.Person;

public class FluentBuilder {
	
	protected Person person = new Person();

	public FluentBuilder name(String name) {
		person.name = name;
		return this;
	}

	public FluentBuilder age(int age) {
		person.age = age;
		return this;
	}
	
	public FluentBuilder role(String role) {
		person.role = role;
		return this;
	}

	public Person build() {
		return person;
	}

}
