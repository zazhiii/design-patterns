package Create.Factory.P01_before;

/**
 * @author zazhi
 * @date 2025/5/17
 * @description: 咖啡类
 */
public abstract class Coffee {

    public abstract String getName();

    public void addSugar() {
        System.out.println("加糖");
    }

    public void addMilk() {
        System.out.println("加奶");
    }
}
