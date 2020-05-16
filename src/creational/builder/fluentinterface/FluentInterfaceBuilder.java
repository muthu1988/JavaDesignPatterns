package creational.builder.fluentinterface;

/**
 * @author muthu kumaran
 *
 */
public class FluentInterfaceBuilder extends PersonBuilder<FluentInterfaceBuilder> {
	public FluentInterfaceBuilder role(String role) {
		person.role = role;
		return self();
	}
	@Override
	public FluentInterfaceBuilder self() {
		return this;
	}
}