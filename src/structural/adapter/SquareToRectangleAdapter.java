package structural.adapter;

public class SquareToRectangleAdapter implements Rectangle {
	
	private Square s;

	public SquareToRectangleAdapter(Square square) {
		s = square;
	}

	@Override
	public int getWidth() {
		return s.side;
	}

	@Override
	public int getHeight() {
		return s.side;
	}

	@Override
	public String toString() {
		return "SquareToRectangleAdapter [getWidth()=" + getWidth() + ", getHeight()=" + getHeight() + ", getArea()=" + getArea() +"]";
	}
		
}