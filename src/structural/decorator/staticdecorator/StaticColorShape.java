package structural.decorator.staticdecorator;

import java.util.function.Supplier;

import structural.decorator.Shape;

public class StaticColorShape<T extends Shape> implements Shape {
	
	private Shape shape;
	
	private String color;
	
	public StaticColorShape(Supplier<? extends T> supplier, String color) {
		shape = supplier.get();
		this.color = color; 
	}

	@Override
	public String info() {
		return shape.info() + " of color " + color;
	}
	
	
}
