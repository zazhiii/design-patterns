package Structure.Adapter.class_adapter;

/**
 * @author zazhi
 * @date 2025/7/1
 * @description: Computer类，表示计算机设备
 */
public class Computer {

    /**
     * 读取SD卡数据
     *
     * @return SD卡数据
     */
    public String readSD(SDCard sd) {
        return sd.readSD();
    }
}
