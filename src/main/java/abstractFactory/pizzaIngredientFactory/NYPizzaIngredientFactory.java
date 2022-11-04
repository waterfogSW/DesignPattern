package abstractFactory.pizzaIngredientFactory;

import abstractFactory.pizzaIngredient.Cheese;
import abstractFactory.pizzaIngredient.Clams;
import abstractFactory.pizzaIngredient.Dough;
import abstractFactory.pizzaIngredient.FreshClams;
import abstractFactory.pizzaIngredient.Garlic;
import abstractFactory.pizzaIngredient.MarinaraSauce;
import abstractFactory.pizzaIngredient.Mushroom;
import abstractFactory.pizzaIngredient.Onion;
import abstractFactory.pizzaIngredient.Pepperoni;
import abstractFactory.pizzaIngredient.RedPepper;
import abstractFactory.pizzaIngredient.ReggianoCheese;
import abstractFactory.pizzaIngredient.Sauce;
import abstractFactory.pizzaIngredient.SlicedPepperoni;
import abstractFactory.pizzaIngredient.ThinCrustDough;
import abstractFactory.pizzaIngredient.Veggies;

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
