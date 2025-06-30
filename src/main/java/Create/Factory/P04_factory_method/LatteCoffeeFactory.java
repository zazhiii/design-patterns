package Create.Factory.P04_factory_method;

/**
 * @author zazhi
 * @date 2025/5/17
 * @description: 拿铁咖啡工厂
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
