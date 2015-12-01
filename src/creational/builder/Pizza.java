package creational.builder;

/**
 * Created by Hoàng on 12/1/2015.
 */
public class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getDough() {
        return this.dough;
    }

    public String getSauce() {
        return this.sauce;
    }

    public String getTopping() {
        return this.topping;
    }
}
