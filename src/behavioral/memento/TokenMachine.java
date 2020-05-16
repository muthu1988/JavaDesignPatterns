package behavioral.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class TokenMachine {
	public List<Token> tokens = new ArrayList<>();

	public Memento addToken(int value) {
		// todo
		tokens.add(new Token(value));
		Memento m = new Memento();
		m.tokens = tokens.stream().map((t) -> new Token(t.value)).collect(Collectors.toList());
		return m;
	}

	public Memento addToken(Token token) {
		// todo (yes, please do both overloads :)
		tokens.add(token);
		Memento m = new Memento();
		m.tokens = tokens.stream().map((t) -> new Token(t.value)).collect(Collectors.toList());
		return m;
	}

	public void revert(Memento m) {
		// todo
		tokens = new ArrayList<>(m.tokens);
	}
}