package abstractFactory.pizzaIngredientFactory;

import abstractFactory.pizzaIngredient.BlackOlives;
import abstractFactory.pizzaIngredient.Cheese;
import abstractFactory.pizzaIngredient.Clams;
import abstractFactory.pizzaIngredient.Dough;
import abstractFactory.pizzaIngredient.Eggplant;
import abstractFactory.pizzaIngredient.FrozenClams;
import abstractFactory.pizzaIngredient.MozzarellaCheese;
import abstractFactory.pizzaIngredient.Pepperoni;
import abstractFactory.pizzaIngredient.PlumTomatoSauce;
import abstractFactory.pizzaIngredient.Sauce;
import abstractFactory.pizzaIngredient.SlicedPepperoni;
import abstractFactory.pizzaIngredient.Spinach;
import abstractFactory.pizzaIngredient.ThickCrustDough;
import abstractFactory.pizzaIngredient.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

  public Dough createDough() {
    return new ThickCrustDough();
  }

  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }

  public Cheese createCheese() {
    return new MozzarellaCheese();
  }

  public Veggies[] createVeggies() {
    Veggies[] veggies = {new BlackOlives(),
        new Spinach(),
        new Eggplant()};
    return veggies;
  }

  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  public Clams createClam() {
    return new FrozenClams();
  }

}
