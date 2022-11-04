package strategy.domain.duck;

import strategy.domain.flyBehavior.FlyRocketPowered;
import strategy.domain.quackBehavior.FakeQuack;

public class ModelDuck extends Duck {

  public ModelDuck() {
    super(new FlyRocketPowered(), new FakeQuack());
  }

  @Override
  public void display() {
    System.out.println("I'm a model duck");
  }

}
