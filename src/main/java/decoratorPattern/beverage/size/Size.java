package decoratorPattern.beverage.size;

import decoratorPattern.beverage.Beverage;

public abstract class Size extends Beverage {

  protected final Beverage beverage;

  protected Size(Beverage beverage) {this.beverage = beverage;}

  public abstract String getDescription();

}
