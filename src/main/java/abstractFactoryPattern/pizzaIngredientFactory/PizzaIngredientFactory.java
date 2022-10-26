package abstractFactoryPattern.pizzaIngredientFactory;

import abstractFactoryPattern.pizzaIngredient.Cheese;
import abstractFactoryPattern.pizzaIngredient.Clams;
import abstractFactoryPattern.pizzaIngredient.Dough;
import abstractFactoryPattern.pizzaIngredient.Pepperoni;
import abstractFactoryPattern.pizzaIngredient.Sauce;
import abstractFactoryPattern.pizzaIngredient.Veggies;

public interface PizzaIngredientFactory {

  Dough createDough();

  Sauce createSauce();

  Cheese createCheese();

  Veggies[] createVeggies();

  Pepperoni createPepperoni();

  Clams createClam();

}
