package factoryMethod.pizzaStore;

import factoryMethod.pizza.CheesePizza;
import factoryMethod.pizza.ClamPizza;
import factoryMethod.pizza.PepperoniPizza;
import factoryMethod.pizza.Pizza;
import factoryMethod.pizza.VeggiePizza;

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
