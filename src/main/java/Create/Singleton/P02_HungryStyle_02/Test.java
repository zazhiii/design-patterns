package Create.Singleton.P02_HungryStyle_02;

/**
 * @author zazhi
 * @date 2025/5/16
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        // 获取单例对象
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2); // true
    }
}
