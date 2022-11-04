package decorator.beverage.size;

import decorator.beverage.Beverage;

public class Grande extends Size {

  protected Grande(Beverage beverage) {
    super(beverage);
  }

  @Override
  public double cost() {
    return beverage.cost() + .1;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Grande";
  }

}
