package factoryMethodPattern.pizzaStore;

import factoryMethodPattern.pizza.CheesePizza;
import factoryMethodPattern.pizza.ClamPizza;
import factoryMethodPattern.pizza.PepperoniPizza;
import factoryMethodPattern.pizza.Pizza;
import factoryMethodPattern.pizza.VeggiePizza;

public class MyPizzaStore extends PizzaStore{

  @Override
  Pizza createPizza(String type) {
    return switch (type) {
      case "cheese" -> new CheesePizza();
      case "pepperoni" -> new PepperoniPizza();
      case "clam" -> new ClamPizza();
      case "veggie" -> new VeggiePizza();
      default -> null;
    };
  }
}
