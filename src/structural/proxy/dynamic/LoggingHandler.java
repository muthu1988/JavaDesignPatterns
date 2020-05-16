package structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LoggingHandler implements InvocationHandler {
	
	private final Object target;
	
	public LoggingHandler(Object target) {
		this.target = target;
	}

	private Map<String, Integer> calls = new HashMap<String, Integer>();
	
	@Override
	public Object invoke(Object target, Method method, Object[] args) throws Throwable {
		String mtdName = method.getName();
		if(mtdName.equals("toString")) return calls.toString();
		calls.merge(mtdName, 1, Integer::sum);
		return method.invoke(this.target, args);
	}

}
