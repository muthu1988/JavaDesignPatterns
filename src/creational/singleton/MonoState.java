package creational.singleton;

public class MonoState {
	private static String name;
	private static String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		MonoState.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		MonoState.type = type;
	}
}