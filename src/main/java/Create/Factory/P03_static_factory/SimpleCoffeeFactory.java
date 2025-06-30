package Create.Factory.P03_static_factory;

/**
 * @author zazhi
 * @date 2025/5/17
 * @description: 简单咖啡工厂类
 */
public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type) {
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
