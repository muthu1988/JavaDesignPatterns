package creational.factory;

public class Factory {

	public static void main(String[] args) {
		
		System.out.println("Point Created with Factory method :");
		Point point = Point.newCartesianPoint(1, 2);
		System.out.println(point);
		
		System.out.println("\nPoint Created with Inner Static class :");
		Point point1 = Point.Factory.newCartesianPoint(1, 2);
		System.out.println(point1);

		System.out.println("\nPoint Created with Factory class :");
		NewPoint point2 = PointFactory.newCartesianPoint(1, 2);
		System.out.println(point2);

	}

}
