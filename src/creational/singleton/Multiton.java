package creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class Multiton {
	
	private Multiton() {
		System.out.println("Singletons created # " + (map.size() + 1));
	}

	public static final Map<MultitonType, Multiton> map = new HashMap<>();

	public static Multiton getInstance(MultitonType type) {
		if (!map.containsKey(type)) {
			Multiton multiton = new Multiton();
			map.put(type, multiton);
		} else {
			System.out.println(type + " Singleton already created");
		}
		return map.get(type);
	}
}