package structural.adapter;

public class Adapter {
	
	public static void main(String[] args) {
		// SquareToRectangleAdapter helps us to adopt a square into a rectangle interface
		System.out.println("SquareToRectangleAdapter helps us to adopt a square into a rectangle interface");
		SquareToRectangleAdapter adapter = new SquareToRectangleAdapter(new Square(4));
		System.out.println(adapter);
	}
}
