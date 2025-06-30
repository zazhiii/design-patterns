package Create.Builder.demo_0.Director;

import Create.Builder.demo_0.builder.Builder;
import Create.Builder.demo_0.pojo.Bike;

/**
 * @author zazhi
 * @date 2025/6/30
 * @description: 指挥者类
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 指挥建造过程
     */
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.getBike();
    }
}
