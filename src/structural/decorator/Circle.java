package structural.decorator;

public class Circle implements Shape {
	
	private float radius;
	
	public Circle() {}
	
	public Circle(float radius) {
		super();
		this.radius = radius;
	}
	
	void reSize(float factor) {
		radius *= factor;
	}

	@Override
	public String info() {
		return "This is a circle of radius " + radius;
	}
	
}