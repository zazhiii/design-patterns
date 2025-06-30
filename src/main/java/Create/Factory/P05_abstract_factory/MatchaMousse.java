package Create.Factory.P05_abstract_factory;

/**
 * @author zazhi
 * @date 2025/5/17
 * @description: 抹茶慕斯类
 */
public class MatchaMousse extends Dessert {

    public MatchaMousse() {
        this.name = "抹茶慕斯";
    }

    @Override
    public String getName() {
        return name;
    }
}
