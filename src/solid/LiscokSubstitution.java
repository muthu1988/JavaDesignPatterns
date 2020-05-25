package solid;

class Rectangle {

	private int breath;
	private int lenght;
	
	public int getBreath() {
		return breath;
	}
	public void setBreath(int breath) {
		this.breath = breath;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

}

class Square extends Rectangle {

	public Square(int size) {
		this.setLenght(size);
		this.setBreath(size);
	}
	
}

class AreaCalc {
	
	static int area(Rectangle rectangle) {
		return rectangle.getLenght() * rectangle.getBreath();
	}
	
}

public class LiscokSubstitution {
	
	public static void main(String[] args) {
		
		System.out.println("Liskov Substitutional Principle - Able to substitute a base type for a sub type");
		Rectangle sq = new Square(4);
		sq.setLenght(3);
		System.out.println("Expected area of square as " + sq.getLenght() * sq.getLenght() + " or " + sq.getBreath() * sq.getBreath() + " but got "  + AreaCalc.area(sq));
	}

}
