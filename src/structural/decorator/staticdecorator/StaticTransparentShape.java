package structural.decorator.staticdecorator;

import java.util.function.Supplier;

import structural.decorator.Shape;

public class StaticTransparentShape<T extends Shape> implements Shape {
	
	private Shape shape;
	
	private int transparency;
	
	public StaticTransparentShape(Supplier<? extends T> supplier, int transparency) {
		shape = supplier.get();
		this.transparency = transparency; 
	}

	@Override
	public String info() {
		return shape.info() + " of transparency " + transparency;
	}
	
	
}
