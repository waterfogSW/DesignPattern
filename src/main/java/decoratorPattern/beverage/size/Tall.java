package decoratorPattern.beverage.size;

import decoratorPattern.beverage.Beverage;

public class Tall extends Size {

  protected Tall(Beverage beverage) {
    super(beverage);
  }

  @Override
  public double cost() {
    return beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Tall";
  }

}
