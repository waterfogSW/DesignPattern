package strategyPattern.domain.duck;

import strategyPattern.domain.flyBehavior.FlyWithWings;
import strategyPattern.domain.quackBehavior.Squeak;

public class RedHeadDuck extends Duck {

  public RedHeadDuck() {
    super(new FlyWithWings(), new Squeak());
  }

  public void display() {
    System.out.println("I'm a real Red Headed duck");
  }

}
