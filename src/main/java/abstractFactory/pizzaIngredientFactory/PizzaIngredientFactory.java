package abstractFactory.pizzaIngredientFactory;

import abstractFactory.pizzaIngredient.Cheese;
import abstractFactory.pizzaIngredient.Clams;
import abstractFactory.pizzaIngredient.Dough;
import abstractFactory.pizzaIngredient.Pepperoni;
import abstractFactory.pizzaIngredient.Sauce;
import abstractFactory.pizzaIngredient.Veggies;

public interface PizzaIngredientFactory {

  Dough createDough();

  Sauce createSauce();

  Cheese createCheese();

  Veggies[] createVeggies();

  Pepperoni createPepperoni();

  Clams createClam();

}
