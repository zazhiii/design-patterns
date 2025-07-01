package Structure.decorator;

/**
 * @author zazhi
 * @date 2025/7/1
 * @description: FriedRice类，表示炒饭快餐
 */
public class FriedRice extends FastFood{

    public FriedRice() {
        super(20, "炒饭");
    }

    @Override
    public int cost() {
        return getPrice();
    }
}
