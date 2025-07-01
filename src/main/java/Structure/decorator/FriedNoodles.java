package Structure.decorator;

/**
 * @author zazhi
 * @date 2025/7/1
 * @description: FriedNoodles类，表示炒面快餐
 */
public class FriedNoodles extends FastFood{

    public FriedNoodles() {
        super(15, "炒面");
    }

    @Override
    public int cost() {
        return getPrice();
    }
}
