package abstractFactoryPattern;

public class Main {

  public static void main(String[] args) {
    PizzaIngredientFactory newYork = new NYPizzaIngredientFactory();
    PizzaIngredientFactory chicago = new ChicagoPizzaIngredientFactory();

    Pizza myPizza = new CheesePizza(newYork);
    System.out.println(myPizza);

    myPizza = new CheesePizza(chicago);
    System.out.println(myPizza);

  }

}
