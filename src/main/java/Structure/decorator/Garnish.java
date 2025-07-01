package Structure.decorator;

/**
 * @author zazhi
 * @date 2025/7/1
 * @description: Garnish类，表示装饰品
 */
public abstract class Garnish extends FastFood{
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood, Integer price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
