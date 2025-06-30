package Structure.Proxy.jdk_proxy;

import java.lang.reflect.Proxy;

/**
 * @author zazhi
 * @date 2025/6/30
 * @description: 代理工厂类
 */
public class ProxyFactory {

    private Object proxy;

    public ProxyFactory(Object proxy) {
        this.proxy = proxy;
    }

    public Object getProxy() {
        Object proxy = Proxy.newProxyInstance(
                this.proxy.getClass().getClassLoader(),
                this.proxy.getClass().getInterfaces(),
                (proxyInstance, method, args) -> {
                    System.out.println("Before method: " + method.getName());
                    Object result = method.invoke(this.proxy, args);
                    System.out.println("After method: " + method.getName());
                    return result;
                }
        );
        return proxy;
    }
}
