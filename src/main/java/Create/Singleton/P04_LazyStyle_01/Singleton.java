package Create.Singleton.P04_LazyStyle_01;

/**
 * @author zazhi
 * @date 2025/5/16
 * @description: 单例模式 -- 懒汉式
 */
public class Singleton {

    private Singleton(){}

    private static Singleton instance;

    // * 加锁保证线程安全
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
