package test_2022_10_27;

public class ChicagoPizzaFactory implements PizzaFactory {

  @Override
  public Pizza getClamPizza() {
    return new ChicagoStyleClamPizza();
  }

  @Override
  public Pizza getCheesePizza() {
    return new ChicagoStyleCheesePizza();
  }

  @Override
  public Pizza getPepperoniPizza() {
    return new ChicagoStylePepperoniPizza();
  }

  @Override
  public Pizza getVeggiePizza() {
    return new ChicagoStyleVeggiePizza();
  }

}
