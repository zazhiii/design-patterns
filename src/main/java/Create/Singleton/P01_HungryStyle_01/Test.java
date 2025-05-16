package Create.Singleton.P01_HungryStyle_01;

/**
 * @author zazhi
 * @date 2025/5/16
 * @description: 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 获取单例对象
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2); // true
    }
}
