package creational.singleton;

public class Singleton {
	
	public static void main(String[] args) {
		
		// Basic singleton
		System.out.println("Basic singleton - private constructor, static final instance initialized, get instance mtd");
		BasicSingleton bs1 = BasicSingleton.getInstance();
		BasicSingleton bs2 = BasicSingleton.getInstance();
		System.out.println("Objects are  equal as bs1 == bs2 is : " + (bs1 == bs2));
		
		// Static Block Singleton
		System.out.println("\nStatic Block Singleton - private constructor, static final instance initialized, get instance mtd, with static block");
		StaticBlockSingleton ss1 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton ss2 = StaticBlockSingleton.getInstance();
		System.out.println("Objects are equal as ss1 == ss2 is : " + (ss1 == ss2));
		
		// Lazy Singleton
		System.out.println("\nLazy Singleton - private constructor, static final instance initialized, get instance mtd, double check thread safe");
		LazySingleton ls1 = LazySingleton.getInstance();
		LazySingleton ls2 = LazySingleton.getInstance();
		System.out.println("Objects are equal as ls1 == ls2 is : " + (ls1 == ls2));
		
		// Inner Static Singleton
		System.out.println("\nInner Static Singleton - private constructor, static final instance initialized, get instance mtd,static class");
		InnerStaticSingleton iss1 = InnerStaticSingleton.getInstance();
		InnerStaticSingleton iss2 = InnerStaticSingleton.getInstance();
		System.out.println("Objects are equal as iss1 == iss2 is : " + (iss1 == iss2));
		
		// Enum Singleton
		System.out.println("\nEnum Singleton - instance enum declared");
		EnumSingleton es1 = EnumSingleton.INSTANCE;
		EnumSingleton es2 = EnumSingleton.INSTANCE;
		System.out.println("Objects are equal as es1 == es2 is : " + (es1 == es2));
		
		// MonoState - can create as many object we want, but all will share same state
		System.out.println("\nMonoState - all members of class are static");
		MonoState ms1 = new MonoState(); ms1.setName("muthu");ms1.setName("person");
		MonoState ms2 = new MonoState(); ms1.setName("i10");ms1.setName("car");
		System.out.println("Objects are not equal as ms1 == ms2 is : " + (ms1 == ms2));
		System.out.println("Butms1.getName() == ms2.getName() as name is made static : " + (ms1.getName() == ms2.getName()));
		
		// Multiton - can create multiple singleton from same class
		System.out.println("\nMultiton - singleton objects created and stored in Map");
		Multiton one = Multiton.getInstance(MultitonType.TYPE1);
		Multiton two = Multiton.getInstance(MultitonType.TYPE2);
		Multiton three = Multiton.getInstance(MultitonType.TYPE3);
		Multiton one1 = Multiton.getInstance(MultitonType.TYPE1);
		System.out.println("3 singleton created and to confirm, one == one1 : " + (one == one1));
		
		System.out.println("\nFor easy testability make sure to use dependecy injected objects in singleton that enables easy mocking and UT");
		
	}
	
}



