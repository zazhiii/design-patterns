package Structure.Proxy.cglib_proxy;

/**
 * @author zazhi
 * @date 2025/6/30
 * @description: 客户端类，用于测试CGLIB代理模式
 */
public class Client {
    public static void main(String[] args) {

        // 创建代理工厂
        ProxyFactory proxyFactory = new ProxyFactory(new TrainStation());

        // 获取代理对象
        TrainStation proxy = (TrainStation) proxyFactory.getProxy();

        // 调用代理方法
        proxy.sell();
    }
}
