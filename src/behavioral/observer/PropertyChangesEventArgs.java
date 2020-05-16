package behavioral.observer;

public class PropertyChangesEventArgs {
	
	public Object source;
	public String propertyName;
	public Object oldValue;
	public Object newValue;
	public PropertyChangesEventArgs(Object source, String propertyName, Object oldValue, Object newValue) {
		super();
		this.source = source;
		this.propertyName = propertyName;
		this.oldValue = oldValue;
		this.newValue = newValue;
	}
}
