package structural.flyweight;

public class FlyWeight {
	
	public static void main(String[] args) {
		
		System.out.println("Fly Weight");
		System.out.println("sentense class has a map of WordToken, store capitalize boolean");
		Sentence s = new Sentence("hello world");
		System.out.println("getWord method will add new WordToken for in map and return the same");
		s.getWord(1).capitalize = true;
		System.out.println("Now we will iterate words in sentence and capitalize is true for its index in map");
		System.out.println(s);
	}

}
