package behavioral.strategy;

public class MarkDownStrategy  implements ListStrategy {

	@Override
	public void addItems(StringBuilder sb, String item) {
		sb.append(" * ").append(item).append(System.lineSeparator());
	}
}
