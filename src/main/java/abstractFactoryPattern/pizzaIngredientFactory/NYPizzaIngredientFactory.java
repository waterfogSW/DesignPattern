package abstractFactoryPattern.pizzaIngredientFactory;

import abstractFactoryPattern.pizzaIngredient.Cheese;
import abstractFactoryPattern.pizzaIngredient.Clams;
import abstractFactoryPattern.pizzaIngredient.Dough;
import abstractFactoryPattern.pizzaIngredient.FreshClams;
import abstractFactoryPattern.pizzaIngredient.Garlic;
import abstractFactoryPattern.pizzaIngredient.MarinaraSauce;
import abstractFactoryPattern.pizzaIngredient.Mushroom;
import abstractFactoryPattern.pizzaIngredient.Onion;
import abstractFactoryPattern.pizzaIngredient.Pepperoni;
import abstractFactoryPattern.pizzaIngredient.RedPepper;
import abstractFactoryPattern.pizzaIngredient.ReggianoCheese;
import abstractFactoryPattern.pizzaIngredient.Sauce;
import abstractFactoryPattern.pizzaIngredient.SlicedPepperoni;
import abstractFactoryPattern.pizzaIngredient.ThinCrustDough;
import abstractFactoryPattern.pizzaIngredient.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

  public Dough createDough() {
    return new ThinCrustDough();
  }

  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  public Veggies[] createVeggies() {
    Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    return veggies;
  }

  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  public Clams createClam() {
    return new FreshClams();
  }

}
