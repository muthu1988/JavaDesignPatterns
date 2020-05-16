package behavioral.interpreter;

public class MyInteger implements Element {
	
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	@Override
	public Integer eval() {
		return value;
	}

	@Override
	public String toString() {
		return "MyInteger [value=" + value + "]";
	}
	
}
