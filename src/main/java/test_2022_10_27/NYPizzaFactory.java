package test_2022_10_27;

public class NYPizzaFactory implements PizzaFactory {

  @Override
  public Pizza getClamPizza() {
    return new NYStyleClamPizza();
  }

  @Override
  public Pizza getCheesePizza() {
    return new NYStyleCheesePizza();
  }

  @Override
  public Pizza getPepperoniPizza() {
    return new NYStylePepperoniPizza();
  }

  @Override
  public Pizza getVeggiePizza() {
    return new NYStyleVeggiePizza();
  }

}
