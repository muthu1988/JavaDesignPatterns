package creational.singleton;
/**
 * @author muthu kumaran
 * @Description 
 * 	Basic singleton class with
 * 		- Private constructor
 * 		- static final ISTANCE parameter
 * 		- public getInstance mtd to return INSTANCE
 */
public class BasicSingleton {

	private BasicSingleton() {
	}

	private static final BasicSingleton INSTANCE = new BasicSingleton();

	public static BasicSingleton getInstance() {
		return INSTANCE;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return INSTANCE;
	}

	protected Object readResolve() {
		return INSTANCE;
	}

}