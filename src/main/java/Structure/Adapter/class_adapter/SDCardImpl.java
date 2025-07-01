package Structure.Adapter.class_adapter;

/**
 * @author zazhi
 * @date 2025/7/1
 * @description: SDCardImpl类，实现了SDCard接口
 */
public class SDCardImpl implements SDCard {

    String msg = "";

    @Override
    public String readSD() {
        return "SDCard msg: " + msg;
    }

    @Override
    public void writeSD(String msg) {
        msg = msg;
        System.out.println("SDCard write: " + msg);
    }
}
