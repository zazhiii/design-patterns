package Create.Singleton.P01_HungryStyle_01;

/**
 * @author zazhi
 * @date 2025/5/16
 * @description: 单例模式 -- 饿汉式 -- 静态成员变量
 */
public class Singleton {

    // 私有构造函数，防止外部实例化
    private Singleton() { }

    private static final Singleton INSTANCE = new Singleton();

    public static Singleton getInstance() {
        return INSTANCE;
    }

}
