package creational.builder;

/**
 * Created by Hoàng on 12/1/2015.
 */
public class BuilderMain {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.setPizzaBuilder(new HawaiianPizzaBuilder());
        waiter.constructPizza();
        printPizza(waiter.getPizza());
        waiter.setPizzaBuilder(new SpicyPizzaBuilder());
        waiter.constructPizza();
        printPizza(waiter.getPizza());
    }

    private static void printPizza(Pizza pizza) {
        System.out.println(pizza.getDough());
        System.out.println(pizza.getSauce());
        System.out.println(pizza.getTopping());
    }
}
