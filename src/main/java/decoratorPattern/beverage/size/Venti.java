package decoratorPattern.beverage.size;

import decoratorPattern.beverage.Beverage;

public class Venti extends Size {

  protected Venti(Beverage beverage) {
    super(beverage);
  }

  @Override
  public double cost() {
    return beverage.cost() + .2;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Venti";
  }

}
