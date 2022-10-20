package factoryMethodPattern.pizzaStore;

import factoryMethodPattern.pizza.Pizza;
import factoryMethodPattern.pizza.morePizza.ChicagoStyleCheesePizza;
import factoryMethodPattern.pizza.morePizza.ChicagoStyleClamPizza;
import factoryMethodPattern.pizza.morePizza.ChicagoStylePepperoniPizza;
import factoryMethodPattern.pizza.morePizza.ChicagoStyleVeggiePizza;
import factoryMethodPattern.pizza.morePizza.NYStyleCheesePizza;
import factoryMethodPattern.pizza.morePizza.NYStyleClamPizza;
import factoryMethodPattern.pizza.morePizza.NYStylePepperoniPizza;
import factoryMethodPattern.pizza.morePizza.NYStyleVeggiePizza;

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
