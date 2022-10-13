package decoratorPattern.beverage.condiment;

import decoratorPattern.beverage.Beverage;

public class Mocha extends Condiment {

  public Mocha(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }

  @Override
  public double cost() {
    return .05 + beverage.cost();
  }

}
