package Structure.Adapter.class_adapter;

/**
 * @author zazhi
 * @date 2025/7/1
 * @description: TFCardImpl类，实现了TFCard接口
 */
public class TFCardImpl implements TFCard{

    String msg = "";

    @Override
    public String readTF() {
        return "TFCard msg: " + msg;
    }

    @Override
    public void writeTF(String msg) {
        this.msg = msg;
        System.out.println("TFCard write: " + msg);
    }
}
