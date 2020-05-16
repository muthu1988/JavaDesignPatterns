package behavioral.memento;

class Token {
	public int value = 0;

	public Token(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Token [value=" + value + "]";
	}
}