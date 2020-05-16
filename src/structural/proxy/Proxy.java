package structural.proxy;

import structural.proxy.dynamic.Human;
import structural.proxy.dynamic.LoggingHandler;
import structural.proxy.dynamic.Person;
import structural.proxy.dynamic.ProxyCreator;
import structural.proxy.property.Hero;
import structural.proxy.protection.Car;
import structural.proxy.protection.CarProxy;
import structural.proxy.protection.Driver;

public class Proxy {
	
	public static void main(String[] args) {
		
		// Protection Proxy
		System.out.println("Protection Proxy - protects the object behaviour");
		System.out.println("car obect protected by car proxy based on driver age");
		Car car = new CarProxy(new Driver(16));
		car.drive();
		
		// Property Proxy
		System.out.println("\nProperty Proxy - Keeps track of propert changes");
		System.out.println("Hero property 'power' is proxied by Property object with value stored in it");
		Hero hero = new Hero(10);
		hero.getPower();
		
		//Dynamic Proxy
		System.out.println("\nDynamic proxy - Created at runtime, wrapper around object to intersept every method calls in it");
		Person person = new Person();
		Human loggedPerson = ProxyCreator.withLogging(person, Human.class);
		loggedPerson.walk();
		loggedPerson.talk();
		loggedPerson.walk();
		System.out.println(loggedPerson);
		
	}
	
}
