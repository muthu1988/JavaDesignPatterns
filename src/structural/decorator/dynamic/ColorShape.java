package structural.decorator.dynamic;

import structural.decorator.Shape;

public class ColorShape implements Shape {
	
	private Shape shape;
	
	private String color;

	public ColorShape(Shape shape, String color) {
		super();
		this.shape = shape;
		this.color = color;
	}

	@Override
	public String info() {
		return shape.info() + " of color " + color;
	}
	
}