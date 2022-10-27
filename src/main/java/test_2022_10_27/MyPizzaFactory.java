package test_2022_10_27;

public class MyPizzaFactory implements PizzaFactory {

  @Override
  public Pizza getClamPizza() {
    return new ClamPizza();
  }

  @Override
  public Pizza getCheesePizza() {
    return new CheesePizza();
  }

  @Override
  public Pizza getPepperoniPizza() {
    return new PepperoniPizza();
  }

  @Override
  public Pizza getVeggiePizza() {
    return new VeggiePizza();
  }

}
