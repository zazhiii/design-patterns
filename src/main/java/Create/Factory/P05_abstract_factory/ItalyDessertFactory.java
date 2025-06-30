package Create.Factory.P05_abstract_factory;

/**
 * @author zazhi
 * @date 2025/5/17
 * @description: TODO
 */
public class ItalyDessertFactory implements DessertFactory {

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
