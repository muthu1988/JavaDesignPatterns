package behavioral.visitor;

public class VisitorPattern {
	public static void main(String[] args) {
		
		System.out.println("Visitor - pattern where a component(visitor) is allowed to traverse the enitre hierarchy");
		System.out.println("Implemented by propagating a single visit method");
		AdditionExpression additionExpression = new AdditionExpression(new Value(2), new Value(3));
		MultiplicationExpression multiplicationExpression = new MultiplicationExpression(additionExpression, new Value(4));
		ExpressionPrinter visitor = new ExpressionPrinter();
		visitor.visit(multiplicationExpression);
		System.out.println(visitor);
	}
}