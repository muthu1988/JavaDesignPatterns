package behavioral.interpreter;

public class Token {
	
	public enum Type { PLUS, MINUS, INTEGER }
	
	public Type type;
	
	public String value;

	public Token(Type type, String value) {
		super();
		this.type = type;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "`" + value + "` ";
	}

}
