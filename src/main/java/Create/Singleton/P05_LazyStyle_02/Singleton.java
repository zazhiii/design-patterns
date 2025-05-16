package Create.Singleton.P05_LazyStyle_02;

/**
 * @author zazhi
 * @date 2025/5/16
 * @description: 懒汉式 -- 双重检查锁定
 */
public class Singleton {

    private Singleton(){}

    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) { // 第一次检查
            synchronized (Singleton.class) { // 加锁
                if (instance == null) { // 第二次检查
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
