package creational.builder.faceted;

import creational.builder.pojo.NewPerson;

/**
 * @author Muthu Kumaran
 * 	Fluent Faceted Builder
 * 	Switch between sub builder for complex objects
 */
public class FacatedPersonBuilder {
	
	protected NewPerson person = new NewPerson();
	
	public FacatedPersonBuilder addName(String name) {
		person.name = name;
		return this;
	}
	
	public AddressBuilder addLocation() {
		return new AddressBuilder(person);
	}
	
	public JobBuilder addJob() {
		return new JobBuilder(person);
	}
	
	public NewPerson build() {
		return person;
	}
}
