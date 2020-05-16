package behavioral.strategy;

public interface ListStrategy {
	default void start(StringBuilder sb) {};
	void addItems(StringBuilder sb, String item);
	default void end(StringBuilder sb) {};
}
