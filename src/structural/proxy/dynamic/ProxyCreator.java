package structural.proxy.dynamic;

import java.lang.reflect.Proxy;

public class ProxyCreator {
	
	@SuppressWarnings("unchecked")
	public static <T> T withLogging(T target, Class<T> intf) {
		return (T) Proxy.newProxyInstance(intf.getClassLoader(), new Class<?>[] {intf}, new LoggingHandler(target));
	}

}
