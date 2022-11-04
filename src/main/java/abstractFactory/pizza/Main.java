package abstractFactory.pizza;

import abstractFactory.pizzaIngredientFactory.ChicagoPizzaIngredientFactory;
import abstractFactory.pizzaIngredientFactory.NYPizzaIngredientFactory;
import abstractFactory.pizzaIngredientFactory.PizzaIngredientFactory;

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
