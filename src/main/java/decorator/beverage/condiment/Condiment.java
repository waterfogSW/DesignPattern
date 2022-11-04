package decorator.beverage.condiment;

import decorator.beverage.Beverage;

public abstract class Condiment extends Beverage {

  protected final Beverage beverage;

  public Condiment(Beverage beverage) {
    this.beverage = beverage;
  }

  public abstract String getDescription();

}
