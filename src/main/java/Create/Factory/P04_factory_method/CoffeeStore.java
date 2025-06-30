package Create.Factory.P04_factory_method;


/**
 * @author zazhi
 * @date 2025/5/17
 * @description: 咖啡店类
 */
public class CoffeeStore {

    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee() {
//        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();

        Coffee coffee = coffeeFactory.createCoffee();

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }

}
