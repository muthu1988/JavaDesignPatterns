package creational.builder.faceted;

import creational.builder.pojo.NewPerson;

public class JobBuilder extends FacatedPersonBuilder {	
	public JobBuilder(NewPerson person) {
		this.person = person; 
	}
	public JobBuilder designation(String job) {
		person.job = job;
		return this;
	}
	public JobBuilder salary(int salary) {
		person.salary = salary;
		return this;
	}
}