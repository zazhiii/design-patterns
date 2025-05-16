package Create.Singleton.SolveDestroy_02;


import java.lang.reflect.Constructor;

/**
 * @author zazhi
 * @date 2025/5/16
 * @description: 反射破坏单例
 */
public class Client02 {
    public static void main(String[] args) throws Exception{
        Class<Singleton> clazz = Singleton.class;

        Constructor<Singleton> cons = clazz.getDeclaredConstructor();

        // 设置私有构造函数可访问
        cons.setAccessible(true);

        Singleton singleton1 = cons.newInstance();// 创建一个新的实例
        Singleton singleton2 = cons.newInstance();// 创建一个新的实例

        System.out.println(singleton1 == singleton2); // false
    }
}
