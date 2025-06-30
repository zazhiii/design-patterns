package Structure.Proxy.jdk_proxy;

/**
 * @author zazhi
 * @date 2025/6/30
 * @description: 客户端类，用于测试代理模式
 */
public class Client {
    public static void main(String[] args) {

        ProxyFactory proxyFactory = new ProxyFactory(new TrainStation());

        SellTickets proxy = (SellTickets) proxyFactory.getProxy();

        proxy.sell();

    }
}
