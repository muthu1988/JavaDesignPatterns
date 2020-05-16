package creational.builder.faceted;

import creational.builder.pojo.NewPerson;

public class AddressBuilder extends FacatedPersonBuilder {	
	public AddressBuilder(NewPerson person) {
		this.person = person; 
	}
	public AddressBuilder address(String address) {
		person.address = address;
		return this;
	}
	public AddressBuilder city(String city) {
		person.city = city;
		return this;
	}
}