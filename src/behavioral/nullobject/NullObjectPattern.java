package behavioral.nullobject;

public class NullObjectPattern {
	
	public static void main(String[] args) throws Exception {
		System.out.println("Null Object - A no op object that satisfies a dependency by confirming to a required interface");
		System.out.println("Null object created with no op methods or returning non impact values");
		Log log = new NullLog();
		Account account = new Account(log);
		account.someOperation();
		System.out.println("Doing some ops without breaking the usual flow");
	}

}
