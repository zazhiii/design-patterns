package Structure.decorator;

/**
 * @author zazhi
 * @date 2025/7/1
 * @description: Egg类，表示鸡蛋装饰(具体的装饰者)
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    @Override
    public int cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return getFastFood().getDesc() + " + " + super.getDesc();
    }
}
