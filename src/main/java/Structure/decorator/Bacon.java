package Structure.decorator;

/**
 * @author zazhi
 * @date 2025/7/1
 * @description: Egg类，表示鸡蛋装饰(具体的装饰者)
 */
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
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
