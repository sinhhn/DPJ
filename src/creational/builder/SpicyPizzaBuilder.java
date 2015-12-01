package creational.builder;

/**
 * Created by Hoàng on 12/1/2015.
 */
public class SpicyPizzaBuilder extends PizzaBuilder {
    public void buildDough() {
        pizza.setDough("pan baked");
    }

    public void buildSauce() {
        pizza.setSauce("hot");
    }

    public void buildTopping() {
        pizza.setTopping("peppoeroni+salami");
    }
}
