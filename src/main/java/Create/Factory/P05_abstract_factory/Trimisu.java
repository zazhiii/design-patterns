package Create.Factory.P05_abstract_factory;

/**
 * @author zazhi
 * @date 2025/5/17
 * @description: 提拉米苏类
 */
public class Trimisu extends Dessert {

    public Trimisu() {
        this.name = "提拉米苏";
    }

    @Override
    public String getName() {
        return name;
    }
}
