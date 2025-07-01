package Structure.decorator;

/**
 * @author zazhi
 * @date 2025/7/1
 * @description: Client类，表示客户端
 */
public class Client {
    public static void main(String[] args) {
        FastFood fastFood = new FriedNoodles();
        System.out.println("点餐：" + fastFood.getDesc() + "，价格：" + fastFood.cost() + "元");

        System.out.println("==========================");
        fastFood = new Egg(fastFood);
        System.out.println("点餐：" + fastFood.getDesc() + "，价格：" + fastFood.cost() + "元");

        System.out.println("==========================");
        fastFood = new Egg(fastFood);
        System.out.println("点餐：" + fastFood.getDesc() + "，价格：" + fastFood.cost() + "元");

        System.out.println("==========================");
        fastFood = new Bacon(fastFood);
        System.out.println("点餐：" + fastFood.getDesc() + "，价格：" + fastFood.cost() + "元");
    }
}
