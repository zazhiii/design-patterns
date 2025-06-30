package Create.Factory.P04_factory_method;

import Create.Factory.P04_factory_method.Coffee;
/**
 * @author zazhi
 * @date 2025/5/17
 * @description:
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
