package Create.Singleton.SolveDestroy_01;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author zazhi
 * @date 2025/5/16
 * @description: 通过序列化和反序列化破坏单例模式
 */
public class Client01 {

    public static void main(String[] args) throws Exception {
        writeObj2File();

        Singleton singleton1 = readObjFromFile();
        Singleton singleton2 = readObjFromFile();

        System.out.println(singleton1 == singleton2); // false
    }

    public static Singleton readObjFromFile() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./a.txt"));

        Singleton singleton = (Singleton) ois.readObject();

        ois.close();

        return singleton;
    }

    public static void writeObj2File() throws Exception {
        Singleton singleton = Singleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./a.txt"));

        oos.writeObject(singleton);

        oos.close();
    }
}
