package behavioral.strategy;

import java.util.Arrays;

public class StrategyPattern {
	
	public static void main(String[] args) {
		
		System.out.println("Stratergy: Enables the exact behaviour of a system to be selected either at run time or compile time");
		
		System.out.println("Dynamic Strategy");
		DynamicTextProcessor dynamicTextProcessor = new DynamicTextProcessor(Format.MARKUP);
		dynamicTextProcessor.appendList(Arrays.asList("One", "Two", "Three"));
		System.out.println(dynamicTextProcessor);
		dynamicTextProcessor.clear();
		dynamicTextProcessor.setFormat(Format.HTML);
		dynamicTextProcessor.appendList(Arrays.asList("One", "Two", "Three"));
		System.out.println(dynamicTextProcessor);
		
		System.out.println("Static Strategy");
		StaticTextProcessor<MarkDownStrategy> markDown = new StaticTextProcessor<>(MarkDownStrategy::new);
		markDown.appendList(Arrays.asList("One", "Two", "Three"));
		System.out.println(markDown);		
		StaticTextProcessor<HtmlStrategy> html = new StaticTextProcessor<>(HtmlStrategy::new);
		html.appendList(Arrays.asList("One", "Two", "Three"));
		System.out.println(html);
		
	}

}
