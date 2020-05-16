package creational.factory;

public class NewPoint {
		
	private double x, y;
	
	protected NewPoint(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "NewPoint [x=" + x + ", y=" + y + "]";
	}

}
