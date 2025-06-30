package Create.Builder.demo_0.builder;

import Create.Builder.demo_0.pojo.Bike;

/**
 * @author zazhi
 * @date 2025/6/30
 * @description: Ofo单车的建造者类
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("Ofo单车的车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("Ofo单车的座椅");
    }

    @Override
    public Bike getBike() {
        return bike;
    }
}
