package abstractFactoryPattern.pizza;

import abstractFactoryPattern.pizzaIngredientFactory.ChicagoPizzaIngredientFactory;
import abstractFactoryPattern.pizzaIngredientFactory.NYPizzaIngredientFactory;
import abstractFactoryPattern.pizzaIngredientFactory.PizzaIngredientFactory;

public class Main {

  public static void main(String[] args) {
    PizzaIngredientFactory newYork = new NYPizzaIngredientFactory();
    PizzaIngredientFactory chicago = new ChicagoPizzaIngredientFactory();

    Pizza myPizza = new CheesePizza(newYork);
    myPizza.prepare();
    myPizza.bake();
    myPizza.cut();
    myPizza.box();
    System.out.println(myPizza);

    myPizza = new CheesePizza(chicago);
    System.out.println(myPizza);

  }

}
