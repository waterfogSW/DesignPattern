package decoratorPattern;

import decoratorPattern.beverage.Beverage;
import decoratorPattern.beverage.DarkRoast;
import decoratorPattern.beverage.Decaf;
import decoratorPattern.beverage.Espresso;
import decoratorPattern.beverage.HouseBlend;
import decoratorPattern.beverage.condiment.Milk;

public class Main {

  public static void main(String[] args) {
    Beverage myBeverage = new HouseBlend();
    myBeverage = new Milk(myBeverage);
    System.out.println(myBeverage.getDescription() + " $" + myBeverage.cost());

    Beverage yourBeverage = new DarkRoast();
    System.out.println(yourBeverage.getDescription() + " $" + yourBeverage.cost());

    Beverage hisBeverage = new Decaf();
    System.out.println(hisBeverage.getDescription() + " $" + hisBeverage.cost());

    Beverage herBeverage = new Espresso();
    System.out.println(herBeverage.getDescription() + " $" + herBeverage.cost());
  }

}
