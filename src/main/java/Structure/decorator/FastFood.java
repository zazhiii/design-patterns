package Structure.decorator;

/**
 * @author zazhi
 * @date 2025/7/1
 * @description: FastFood类，表示快餐
 */
public abstract class FastFood {
    private Integer price;
    private String desc;

    public FastFood(Integer price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public FastFood() { }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract int cost();
}
