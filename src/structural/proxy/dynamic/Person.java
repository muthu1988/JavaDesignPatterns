package structural.proxy.dynamic;

public class Person implements Human {

	@Override
	public void walk() {
		System.out.println("Am walking");
	}

	@Override
	public void talk() {
		System.out.println("Am Talking");
	}

}
