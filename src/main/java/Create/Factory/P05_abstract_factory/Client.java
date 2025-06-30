package Create.Factory.P05_abstract_factory;



/**
 * @author zazhi
 * @date 2025/5/17
 * @description: 客户端
 */
public class Client {

    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();

        store.setDessertFactory(new ItalyDessertFactory());

        Coffee coffee = store.orderCoffee();
        System.out.println("点了一杯" + coffee.getName());
        Dessert dessert = store.orderDessert();
        System.out.println("点了一份" + dessert.getName());

        System.out.println("---------------------");

        store.setDessertFactory(new AmericanDessertFactory());
        Coffee coffee2 = store.orderCoffee();
        System.out.println("点了一杯" + coffee2.getName());
        Dessert dessert2 = store.orderDessert();
        System.out.println("点了一份" + dessert2.getName());



    }
}
