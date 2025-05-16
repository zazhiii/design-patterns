package Create.Singleton.SolveDestroy_01;

import java.io.Serializable;

/**
 * @author zazhi
 * @date 2025/5/16
 * @description: 懒汉式 -- 静态内部类
 */
public class Singleton implements Serializable {

    private Singleton(){}

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    // 防止反序列化破坏单例
    // 当进行反序列化时，JVM会调用readObject方法来直接返回
    private Object readResolve() {
        return getInstance();
    }
}
