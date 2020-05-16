package structural.decorator;

public class Square implements Shape {
	
	private float side;
	
	public Square() {}
	
	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public String info() {
		return "This is a square of side " + side;
	}
	
}