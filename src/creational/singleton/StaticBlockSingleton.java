package creational.singleton;

public class StaticBlockSingleton {

	private StaticBlockSingleton() throws Exception {
		if(false) throw new Exception();
	}

	private static StaticBlockSingleton INSTANCE;
	
	static {
		try {
			INSTANCE = new StaticBlockSingleton();
		} catch (Exception e) {
			System.out.println("Error while creating singleton");
		}
	}

	public static StaticBlockSingleton getInstance() {
		return INSTANCE;
	}

}