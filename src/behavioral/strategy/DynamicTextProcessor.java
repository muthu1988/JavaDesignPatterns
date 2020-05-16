package behavioral.strategy;

import java.util.List;

public class DynamicTextProcessor {
	
	private ListStrategy strategy;	
	private StringBuilder builder = new StringBuilder();
	
	public DynamicTextProcessor(Format format) {
		setFormat(format);
	}

	public void setFormat(Format format) {
		switch (format) {
		case MARKUP:
			strategy = new MarkDownStrategy();
			break;
		case HTML:
			strategy = new HtmlStrategy();
			break;
		default:
			break;
		}
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
