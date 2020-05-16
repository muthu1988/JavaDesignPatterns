package behavioral.chainofresp.brokerchain;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

//CQS
public class Event<Args> {
	
	private Map<Integer, Consumer<Args>> handlers = new HashMap<Integer, Consumer<Args>>();
	
	private int index;
	
	public int subscribe(Consumer<Args> consumer) {
		int i = index;
		handlers.put(i, consumer); index++;
		return i;
	}
	
	public void unSubscribe(int key) {
		handlers.remove(key);
	}
	
	public void fire(Args args) {
		for (Consumer<Args> handler : handlers.values()) {
			handler.accept(args);
		}
	}
	

}
