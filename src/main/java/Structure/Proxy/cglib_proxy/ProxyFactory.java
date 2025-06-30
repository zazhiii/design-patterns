package Structure.Proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

/**
 * @author zazhi
 * @date 2025/6/30
 * @description: 代理工厂类，用于创建代理对象
 */
public class ProxyFactory implements InvocationHandler {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        // 创建增强器
        Enhancer enhancer = new Enhancer();

        // 设置父类
        enhancer.setSuperclass(target.getClass());

        // 设置回调
        enhancer.setCallback(this);

        // 创建代理对象
        return enhancer.create();
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("开始代理...");
        // 调用目标方法
        Object result = method.invoke(target, objects);
        System.out.println("代理结束...");
        return result;
    }
}
