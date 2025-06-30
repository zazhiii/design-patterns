package Create.Factory.P04_factory_method;


/**
 * @author zazhi
 * @date 2025/5/17
 * @description: 客户端
 */
public class Client {

    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();

        // 设置咖啡工厂为美式咖啡工厂
        store.setCoffeeFactory(new AmericanCoffeeFactory());
        Coffee coffee = store.orderCoffee();
        System.out.println("点了一杯" + coffee);

        System.out.println("------------------------");

        // 设置咖啡工厂为拿铁咖啡工厂
        store.setCoffeeFactory(new LatteCoffeeFactory());
        coffee = store.orderCoffee();
        System.out.println("点了一杯" + coffee);
    }
}
