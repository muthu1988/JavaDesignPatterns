package behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

import behavioral.interpreter.Token.Type;

public class Interpreter {

	public static void main(String[] args) {
		System.out.println("Interpreter - Component that process a structured text");
		String addTwoNumber = "32+12";
		String subTwoNumber = "32-12";
		System.out.println("lexing - Get the tokens from the text");
		List<Token> tokens = lex(addTwoNumber);
		System.out.println("\t"+tokens);
		BinaryOpertaion parse = parse(tokens);
		System.out.println("Parsing - Parse the tokens so as to evaluate them");
		System.out.println("\t"+parse);
		System.out.println("Evaluated output: ");
		System.out.println("\t"+addTwoNumber + " = " + parse.eval());
//		System.out.println(subTwoNumber + " = " + parse(lex(subTwoNumber)).eval());
	}

	private static BinaryOpertaion parse(List<Token> tokens) {
		BinaryOpertaion bop = new BinaryOpertaion();
		boolean hasLHS = false;
		for (Token token : tokens) {
			switch (token.type) {
			case INTEGER:
				if(!hasLHS) {
					bop.left = new MyInteger(Integer.parseInt(token.value));
					hasLHS = true;
				} else 
					bop.right = new MyInteger(Integer.parseInt(token.value));
				break;
			default:
				if(token.type.equals(Token.Type.PLUS))
					bop.type = BinaryOpertaion.Type.ADD;
				else if(token.type.equals(Token.Type.MINUS))
					bop.type = BinaryOpertaion.Type.SUB;
				break;
			}
		}
		return bop;
	}

	private static List<Token> lex(String exp) {
		List<Token> list = new ArrayList<>();
		for (int i = 0; i < exp.length(); i++) {
			switch (exp.charAt(i)) {
			case '+':
				list.add(new Token(Type.PLUS, "+"));
				break;
			case '-':
				list.add(new Token(Type.MINUS, "-"));
				break;
			default:
				String s = "" + exp.charAt(i);
				for (int j = i + 1; j < exp.length(); j++) {
					if (Character.isDigit(exp.charAt(j))) {
						s = s + exp.charAt(j);
						++i;
					} else {
						break;
					}
				}
				list.add(new Token(Type.INTEGER, s));
				break;
			}
		}
		return list;
	}

}
