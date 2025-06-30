package Create.Factory.P02_simple_factory;

/**
 * @author zazhi
 * @date 2025/5/17
 * @description: 咖啡店类
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();

        Coffee coffee = factory.createCoffee(type);

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }

}
