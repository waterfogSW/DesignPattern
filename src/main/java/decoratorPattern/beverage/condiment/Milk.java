package decoratorPattern.beverage.condiment;

import decoratorPattern.beverage.Beverage;

public class Milk extends Condiment {

  public Milk(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Milk";
  }

  @Override
  public double cost() {
    return .10 + beverage.cost();
  }

}
