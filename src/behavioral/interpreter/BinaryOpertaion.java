package behavioral.interpreter;

public class BinaryOpertaion implements Element {

	public enum Type { ADD, SUB };
	
	public Type type;
	
	public Element left, right;

	@Override
	public Integer eval() {
		if(type.equals(Type.ADD)) {
			return right.eval() + left.eval(); 
		} else if(type.equals(Type.SUB)) {
			return left.eval() - right.eval();
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "BinaryOpertaion [type=" + type + ", left=" + left + ", right=" + right + "]";
	}
	
}
