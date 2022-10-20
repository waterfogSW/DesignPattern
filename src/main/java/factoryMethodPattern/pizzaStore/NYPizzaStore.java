package factoryMethodPattern.pizzaStore;

import factoryMethodPattern.pizza.Pizza;
import factoryMethodPattern.pizza.morePizza.NYStyleCheesePizza;
import factoryMethodPattern.pizza.morePizza.NYStyleClamPizza;
import factoryMethodPattern.pizza.morePizza.NYStylePepperoniPizza;
import factoryMethodPattern.pizza.morePizza.NYStyleVeggiePizza;

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
