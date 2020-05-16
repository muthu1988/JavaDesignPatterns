package behavioral.memento;

public class MememtoPattern {
	
	public static void main(String[] args) {
		System.out.println("Memento - Token or Handle representing the system state. Enables us to rollback");
		Token token1 = new Token(1);
		Token token2 = new Token(2);
		TokenMachine machine = new TokenMachine();
		Memento m1 = machine.addToken(token1);
		Memento m2 = machine.addToken(token2);
		token1.value = 3;
		System.out.println("Before Restoring: " + machine.tokens);
		machine.revert(m1);
		System.out.println("After Restoring: " + machine.tokens);
	}

}
