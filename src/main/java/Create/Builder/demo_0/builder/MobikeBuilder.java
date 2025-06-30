package Create.Builder.demo_0.builder;

import Create.Builder.demo_0.pojo.Bike;

/**
 * @author zazhi
 * @date 2025/6/30
 * @description: 摩拜单车的建造者类
 */
public class MobikeBuilder extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("摩拜单车的车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("摩拜单车的座椅");
    }

    @Override
    public Bike getBike() {
        return bike;
    }
}
