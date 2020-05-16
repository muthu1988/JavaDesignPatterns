package behavioral.strategy;

import java.util.List;
import java.util.function.Supplier;

public class StaticTextProcessor<T extends ListStrategy> {
	
	private T strategy;	
	private StringBuilder builder = new StringBuilder();
	
	public StaticTextProcessor(Supplier<? extends T> constructor) {
		strategy = constructor.get();
	}
	
	public void appendList(List<String> items) {
		strategy.start(builder);
		for (String string : items) {
			strategy.addItems(builder, string);
		} 
		strategy.start(builder);
	}
	
	public void clear() {
		builder = new StringBuilder();
	}
	
	@Override
	public String toString() {
		return builder.toString();
	}



}
