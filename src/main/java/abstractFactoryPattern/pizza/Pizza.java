package abstractFactoryPattern.pizza;

import abstractFactoryPattern.pizzaIngredient.Cheese;
import abstractFactoryPattern.pizzaIngredient.Clams;
import abstractFactoryPattern.pizzaIngredient.Dough;
import abstractFactoryPattern.pizzaIngredient.Pepperoni;
import abstractFactoryPattern.pizzaIngredient.Sauce;
import abstractFactoryPattern.pizzaIngredient.Veggies;

public abstract class Pizza {

  String name;

  Dough dough;
  Sauce sauce;
  Veggies[] veggies;
  Cheese cheese;
  Pepperoni pepperoni;
  Clams clam;

  protected abstract void prepare();

  void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }

  void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  void box() {
    System.out.println("Place pizza in official PizzaStore box");
  }

  void setName(String name) {
    this.name = name;
  }

  String getName() {
    return name;
  }

  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("---- " + name + " ----\n");
    if (dough != null) {
      result.append(dough);
      result.append("\n");
    }
    if (sauce != null) {
      result.append(sauce);
      result.append("\n");
    }
    if (cheese != null) {
      result.append(cheese);
      result.append("\n");
    }
    if (veggies != null) {
      for (int i = 0; i < veggies.length; i++) {
        result.append(veggies[i]);
        if (i < veggies.length - 1) {
          result.append(", ");
        }
      }
      result.append("\n");
    }
    if (clam != null) {
      result.append(clam);
      result.append("\n");
    }
    if (pepperoni != null) {
      result.append(pepperoni);
      result.append("\n");
    }
    return result.toString();
  }

}
