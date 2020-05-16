package structural.decorator;

import creational.singleton.StaticBlockSingleton;
import structural.decorator.dynamic.ColorShape;
import structural.decorator.dynamic.TransparentShape;
import structural.decorator.staticdecorator.StaticColorShape;
import structural.decorator.staticdecorator.StaticTransparentShape;

public class Decorator {
	
	public static void main(String[] args) {
		
		System.out.println("Dynamic Decorator");
		System.out.println("Colored Circle created by Dynamic decorator:");
		ColorShape blueCircle = new ColorShape(new Circle(5),"blue");
		System.out.println(blueCircle.info());		
		System.out.println("Transparent Square created by Dynamic decorator");
		TransparentShape transparentSquare = new TransparentShape(new Square(5),3);
		System.out.println(transparentSquare.info());
		System.out.println("Transparent Yellow Square created by Dynamic decorator");
		TransparentShape transparentYellowSquare = new TransparentShape(new ColorShape(new Square(5), "yellow") , 3);
		System.out.println(transparentYellowSquare.info());
		
		System.out.println("\nStatic Decorator");
		System.out.println("Transparent Yellow Square created by Static decorator");
		StaticTransparentShape<StaticColorShape<Square>> transparentYellowSq = new StaticTransparentShape<>(
				() -> new StaticColorShape<>(() -> new Square(), "yellow"), 5);
		System.out.println(transparentYellowSq.info());
		
		System.out.println("\nAdapter Decarator");
		System.out.println("Basically this will add more features to decorator along with behaviors from decorator");
		
	}
}