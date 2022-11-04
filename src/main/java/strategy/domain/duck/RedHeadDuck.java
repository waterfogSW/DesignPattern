package strategy.domain.duck;

import strategy.domain.flyBehavior.FlyWithWings;
import strategy.domain.quackBehavior.Squeak;

public class RedHeadDuck extends Duck {

  public RedHeadDuck() {
    super(new FlyWithWings(), new Squeak());
  }

  public void display() {
    System.out.println("I'm a real Red Headed duck");
  }

}
