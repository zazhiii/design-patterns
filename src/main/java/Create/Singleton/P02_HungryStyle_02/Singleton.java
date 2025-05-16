package Create.Singleton.P02_HungryStyle_02;

/**
 * @author zazhi
 * @date 2025/5/16
 * @description: 单例模式 -- 饿汉式 -- 静态代码块
 */
public class Singleton {

    private Singleton(){}

    private static Singleton INSTANCE = null;

    static {
        INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
