package strategyPattern.domain.duck;

import strategyPattern.domain.flyBehavior.FlyNoWay;
import strategyPattern.domain.quackBehavior.Squeak;

public class RubberDuck extends Duck {

  public RubberDuck() {
    super(new FlyNoWay(), new Squeak());
  }

  @Override
  public void display() {
    System.out.println("I'm a rubber duckie");
  }

}
