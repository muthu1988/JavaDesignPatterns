package behavioral.strategy;

public class HtmlStrategy implements ListStrategy {
	
	@Override
	public void start(StringBuilder sb) {
		sb.append("<ul>").append(System.lineSeparator());
	}

	@Override
	public void addItems(StringBuilder sb, String item) {
		sb.append("	<li>").append(item).append("</li>").append(System.lineSeparator());
	}
	
	@Override
	public void end(StringBuilder sb) {
		sb.append("</ul>").append(System.lineSeparator());
	}

}
