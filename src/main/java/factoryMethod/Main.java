package factoryMethod;

import factoryMethod.pizzaStore.ChicagoPizzaStore;
import factoryMethod.pizzaStore.MyPizzaStore;
import factoryMethod.pizzaStore.NYPizzaStore;

public class Main {

  public static void main(String[] args) {
    MyPizzaStore myPizzaStore = new MyPizzaStore();
    var pizza1 = myPizzaStore.orderPizza("clam");
    var pizza2 = myPizzaStore.orderPizza("cheese");

    NYPizzaStore nyPizzaStore = new NYPizzaStore();
    var pizza3 = nyPizzaStore.orderPizza("clam");
    var pizza4 = nyPizzaStore.orderPizza("cheese");

    ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    var pizza5 = chicagoPizzaStore.orderPizza("clam");
    var pizza6 = chicagoPizzaStore.orderPizza("cheese");

  }
}
