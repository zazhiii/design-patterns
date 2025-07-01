package Structure.Adapter.object_adapter;

import Structure.Adapter.object_adapter.TFCard;

/**
 * @author zazhi
 * @date 2025/7/1
 * @description: TODO
 */
public class SDAdapterTF implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("SDAdapterTF readSD");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        tfCard.writeTF(msg);
    }
}
