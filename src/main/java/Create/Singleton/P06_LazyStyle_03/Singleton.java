package Create.Singleton.P06_LazyStyle_03;

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
}
