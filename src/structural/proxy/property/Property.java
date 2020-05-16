package structural.proxy.property;

public class Property<T> {
	
	private T value;

	public T getValue() {
		System.out.println("Hero power set in PROXY");
		return value;
	}

	public void setValue(T value) {
		System.out.println("Hero power got in PROXY");
		this.value = value;
	}

}
