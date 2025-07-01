package Structure.Adapter.class_adapter;

/**
 * @author zazhi
 * @date 2025/7/1
 * @description: 客户端类，用于测试适配器模式
 */
public class Client {
    public static void main(String[] args) {
        Computer cpt = new Computer();
        // 读取SD卡数据
        String msg = cpt.readSD(new SDCardImpl());
        System.out.println("读取到的SD卡数据: " + msg);

        System.out.println("==========================");

        Computer cpt2 = new Computer();
        // 读取SD卡数据
        String msg2 = cpt2.readSD(new SDAdapterTF());
        System.out.println("读取到的SD卡数据: " + msg2);
    }
}
