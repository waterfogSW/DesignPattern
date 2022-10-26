package abstractFactoryPattern.pizzaIngredientFactory;

import abstractFactoryPattern.pizzaIngredient.BlackOlives;
import abstractFactoryPattern.pizzaIngredient.Cheese;
import abstractFactoryPattern.pizzaIngredient.Clams;
import abstractFactoryPattern.pizzaIngredient.Dough;
import abstractFactoryPattern.pizzaIngredient.Eggplant;
import abstractFactoryPattern.pizzaIngredient.FrozenClams;
import abstractFactoryPattern.pizzaIngredient.MozzarellaCheese;
import abstractFactoryPattern.pizzaIngredient.Pepperoni;
import abstractFactoryPattern.pizzaIngredient.PlumTomatoSauce;
import abstractFactoryPattern.pizzaIngredient.Sauce;
import abstractFactoryPattern.pizzaIngredient.SlicedPepperoni;
import abstractFactoryPattern.pizzaIngredient.Spinach;
import abstractFactoryPattern.pizzaIngredient.ThickCrustDough;
import abstractFactoryPattern.pizzaIngredient.Veggies;

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
