package decorator.beverage.size;

import decorator.beverage.Beverage;

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
