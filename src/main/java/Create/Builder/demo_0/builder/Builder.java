package Create.Builder.demo_0.builder;

import Create.Builder.demo_0.pojo.Bike;

/**
 * @author zazhi
 * @date 2025/6/30
 * @description: 建造者模式的构建器类
 */
public abstract class Builder {

    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike getBike();
}
