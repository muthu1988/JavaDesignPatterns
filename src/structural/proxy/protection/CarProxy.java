package structural.proxy.protection;

public class CarProxy extends Car {

	public CarProxy(Driver driver) {
		super(driver);
	}
	
	@Override
	public void drive() {
		if(driver.getAge() < 18) System.out.println("Too young to drive"); 
		else super.drive();
	}

}
