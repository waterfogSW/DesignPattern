package strategyPattern.domain.duck;

import strategyPattern.domain.flyBehavior.FlyBehavior;
import strategyPattern.domain.flyBehavior.FlyRocketPowered;
import strategyPattern.domain.flyBehavior.FlyWithWings;
import strategyPattern.domain.quackBehavior.FakeQuack;
import strategyPattern.domain.quackBehavior.QuackBehavior;

public class ModelDuck extends Duck {

  public ModelDuck() {
    super(new FlyRocketPowered(), new FakeQuack());
  }

  @Override
  public void display() {
    System.out.println("I'm a model duck");
  }

}
