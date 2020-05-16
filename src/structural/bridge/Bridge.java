package structural.bridge;

/**
 * @author muthu kumaran
 * Bridge - Decouple abstraction from implementation
 *  both exists as hierarchy (strong encapsulation)
 */
public class Bridge {
	public static void main(String[] args) {
		System.out.println("Triangle is a  sub class of shape");
		System.out.println("It can be Rendered as Vector or Raster");
		System.out.println("Insted of creating 2 sub class of Trianlge, we pass an implementatio of Rendere inteface all way up to shape class");
		System.out.println("\nTriangle and Square Rendered by Vector and Raster");
		System.out.println(new Triangle(new RasterRenderer()).toString());
		System.out.println(new Triangle(new VectorRenderer()).toString());
		System.out.println(new Square(new RasterRenderer()).toString());
		System.out.println(new Square(new VectorRenderer()).toString());
	}
}