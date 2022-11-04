package factoryMethod.pizzaStore;

import factoryMethod.pizza.Pizza;
import factoryMethod.pizza.morePizza.NYStyleCheesePizza;
import factoryMethod.pizza.morePizza.NYStyleClamPizza;
import factoryMethod.pizza.morePizza.NYStylePepperoniPizza;
import factoryMethod.pizza.morePizza.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

  @Override
  Pizza createPizza(String type) {
    return switch (type) {
      case "cheese" -> new NYStyleCheesePizza();
      case "pepperoni" -> new NYStylePepperoniPizza();
      case "clam" -> new NYStyleClamPizza();
      case "veggie" -> new NYStyleVeggiePizza();
      default -> null;
    };
  }

}
