package Create.Factory.P02_simple_factory;

/**
 * @author zazhi
 * @date 2025/5/17
 * @description: 简单咖啡工厂类
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        switch (type) {
            case "American":
                coffee = new AmericanCoffee();
                break;
            case "Latte":
                coffee = new LatteCoffee();
                break;
            default:
                throw new IllegalArgumentException("Unknown coffee type: " + type);
        }
        return coffee;
    }
}
