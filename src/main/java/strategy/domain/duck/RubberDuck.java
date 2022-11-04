package strategy.domain.duck;

import strategy.domain.flyBehavior.FlyNoWay;
import strategy.domain.quackBehavior.Squeak;

public class RubberDuck extends Duck {

  public RubberDuck() {
    super(new FlyNoWay(), new Squeak());
  }

  @Override
  public void display() {
    System.out.println("I'm a rubber duckie");
  }

}
