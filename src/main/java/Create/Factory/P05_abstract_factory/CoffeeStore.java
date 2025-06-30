package Create.Factory.P05_abstract_factory;



/**
 * @author zazhi
 * @date 2025/5/17
 * @description: 咖啡店类
 */
public class CoffeeStore {

    private DessertFactory dessertFactory;


    public void setDessertFactory(DessertFactory dessertFactory) {
        this.dessertFactory = dessertFactory;
    }

    public Coffee orderCoffee() {

        Coffee coffee = dessertFactory.createCoffee();

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }


    public Dessert orderDessert() {

        Dessert dessert = dessertFactory.createDessert();

        return dessert;
    }
}
