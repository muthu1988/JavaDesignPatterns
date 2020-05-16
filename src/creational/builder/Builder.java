package creational.builder;

import creational.builder.faceted.FacatedPersonBuilder;
import creational.builder.fluent.FluentBuilder;
import creational.builder.fluentinterface.FluentInterfaceBuilder;
import creational.builder.pojo.NewPerson;
import creational.builder.pojo.Person;

/**
 * @author muthu kumaran
 * Class with main method
 * Creates Objects using different 
 * builder pattern
 */
public class Builder {
	
	public static void main(String[] args) {
		
		// Creating a Person object using Builder pattern (fluent)
		Person person = new FluentBuilder()
				.name("muthu")
				.age(30)
				.role("Developer")
				.build();
		
		System.out.println("Person careated by Fluent builder: \n" + person);
		
		// Creating a Person object using Builder pattern (fluent inheritance - recursive generic)
		Person employee = new FluentInterfaceBuilder()
			.name("muthu")
			.role("developer")
			.age(25)
			.build();
		
		System.out.println("\nEmployee careated by Fluent Inheritance with Recursive Generic builder: \n" + employee);
		
		// Creating Person object by Faceted builder
		 NewPerson newPerson = new FacatedPersonBuilder()
					.addName("muthu")
					.addLocation()
						.address("Address 1")
						.city("chennai")
					.addJob()
						.designation("developer")
						.salary(20000)
					.build();
		
		System.out.println("\nNewPerson careated by Faceted Fluent builder: \n" + newPerson);

		
		
	}

}
