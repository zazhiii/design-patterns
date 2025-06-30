package Create.Factory.P04_factory_method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zazhi
 * @date 2025/5/17
 * @description: 咖啡类
 */
public abstract class Coffee {

    public abstract String getName();

    public List<String> ingredients = new ArrayList<>();

    public void addSugar() {
        ingredients.add("糖");
    }

    public void addMilk() {
        ingredients.add("牛奶");
    }

    @Override
    public String toString() {
        return "Coffee{" +
                getName() + " ingredients=" + ingredients +
                '}';
    }
}
