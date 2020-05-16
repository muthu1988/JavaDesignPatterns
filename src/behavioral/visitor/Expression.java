package behavioral.visitor;

abstract class Expression {
	abstract void accept(ExpressionVisitor ev);
}