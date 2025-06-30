package Create.Builder.demo_0;

import Create.Builder.demo_0.Director.Director;
import Create.Builder.demo_0.builder.Builder;
import Create.Builder.demo_0.builder.MobikeBuilder;
import Create.Builder.demo_0.builder.OfoBuilder;
import Create.Builder.demo_0.pojo.Bike;

/**
 * @author zazhi
 * @date 2025/6/30
 * @description: 客户端类，用于测试建造者模式
 */
public class Client {
    public static void main(String[] args) {

        System.out.println("构建摩拜单车的过程：");
        Director director = new Director(new MobikeBuilder());
        Bike bike = director.construct();
        System.out.println("摩拜单车构建完成！");
        System.out.println("摩拜单车的车架和座椅已安装完毕。");
        System.out.println("摩拜单车的车架：" + bike.getFrame());
        System.out.println("摩拜单车的座椅：" + bike.getSeat());
        System.out.println("摩拜单车的构建过程结束。");
        System.out.println("=====================================");

        System.out.println("构建Ofo车的过程：");
        Director director2 = new Director(new OfoBuilder());
        Bike bike2 = director2.construct();
        System.out.println("Ofo单车构建完成！");
        System.out.println("Ofo单车的车架和座椅已安装完毕。");
        System.out.println("Ofo单车的车架：" + bike2.getFrame());
        System.out.println("Ofo单车的座椅：" + bike2.getSeat());
        System.out.println("Ofo单车的构建过程结束。");

    }
}
