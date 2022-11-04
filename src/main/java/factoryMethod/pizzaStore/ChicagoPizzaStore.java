package factoryMethod.pizzaStore;

import factoryMethod.pizza.Pizza;
import factoryMethod.pizza.morePizza.ChicagoStyleCheesePizza;
import factoryMethod.pizza.morePizza.ChicagoStyleClamPizza;
import factoryMethod.pizza.morePizza.ChicagoStylePepperoniPizza;
import factoryMethod.pizza.morePizza.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

  @Override
  Pizza createPizza(String type) {
    return switch (type) {
      case "cheese" -> new ChicagoStyleCheesePizza();
      case "pepperoni" -> new ChicagoStylePepperoniPizza();
      case "clam" -> new ChicagoStyleClamPizza();
      case "veggie" -> new ChicagoStyleVeggiePizza();
      default -> null;
    };
  }

}
