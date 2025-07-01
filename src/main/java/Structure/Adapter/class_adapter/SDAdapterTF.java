package Structure.Adapter.class_adapter;

/**
 * @author zazhi
 * @date 2025/7/1
 * @description: TODO
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{

    @Override
    public String readSD() {
        System.out.println("SDAdapterTF readSD");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        writeTF(msg);
    }
}
