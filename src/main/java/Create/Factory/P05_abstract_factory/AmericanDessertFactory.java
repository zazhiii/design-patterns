package Create.Factory.P05_abstract_factory;

/**
 * @author zazhi
 * @date 2025/5/17
 * @description: 美式甜品工厂类
 */
public class AmericanDessertFactory implements DessertFactory {

    public Dessert createDessert() {
        return new MatchaMousse();
    }
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
