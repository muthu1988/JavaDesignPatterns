package creational.factory;

public class PointFactory {
	public static NewPoint newCartesianPoint(double x, double y) {
		return new NewPoint(x, y);
	}
}
