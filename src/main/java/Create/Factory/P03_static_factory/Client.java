package Create.Factory.P03_static_factory;

/**
 * @author zazhi
 * @date 2025/5/17
 * @description: 客户端
 */
public class Client {

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("American");
        System.out.println("点了一杯" + coffee);
        System.out.println("---------------------");
        coffee = coffeeStore.orderCoffee("Latte");
        System.out.println("点了一杯" + coffee);
        System.out.println("---------------------");
        coffee = coffeeStore.orderCoffee("maoshi");
        System.out.println("点了一杯" + coffee);
        System.out.println("---------------------");
    }
}
