package creational.factory;

public class Point {

	private double x, y;

	// Should be private, but for Factory class we made it protected
	private Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// factory method
	public static Point newCartesianPoint(double x, double y) {
		return new Point(x, y);
	}

	public static Point newPolarPoint(double rho, double theta) {
		return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
	}
	
	// Inner static class
	public static class Factory {
		public static Point newCartesianPoint(double x, double y) {
			return new Point(x, y);
		}
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}