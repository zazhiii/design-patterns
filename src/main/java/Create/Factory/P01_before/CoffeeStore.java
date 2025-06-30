package Create.Factory.P01_before;

/**
 * @author zazhi
 * @date 2025/5/17
 * @description: 咖啡店类
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
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

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }

}
