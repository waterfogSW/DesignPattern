package decorator.beverage.condiment;

import decorator.beverage.Beverage;

public class Whip extends Condiment {

  public Whip(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }

  @Override
  public double cost() {
    return .05 + beverage.cost();
  }

}
