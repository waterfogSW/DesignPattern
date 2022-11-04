package decorator.beverage.size;

import decorator.beverage.Beverage;

public abstract class Size extends Beverage {

  protected final Beverage beverage;

  protected Size(Beverage beverage) {this.beverage = beverage;}

  public abstract String getDescription();

}
