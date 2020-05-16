package creational.prototype;

public class ProtoType {
	
	public static void main(String[] args) {
		
		// Point 2 created from point 1 using constructor
		Point point1 = new Point(1,2);	
		Point point2 = new Point(point1);
		System.out.println("Point 2 created as new object, (point1 == point2) fails: " + (point1 == point2));
		System.out.println("State of object remain as x values are same: " + (point1.x == point2.x));
		
		// Line 1 created from Line 2 - deep copy
		Line line1 = new Line(new Point(1,1), new Point(2,2));
		Line line2 = line1.deepCopy();
		System.out.println("\nLine 2 created as new object, (line1 == line2) fails: " + (line1 == line2));
		System.out.println("State of object remain as x values are same: " + (line1.start.x == line2.start.x));
		
		// Easy way is to serialize and deserialize it back and store it in a new object
		System.out.println("\nNote: Easy way is to serialize and deserialize it back to store it in a new object");
		
	}

}
