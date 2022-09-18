package strategyPattern.domain.duck;

import strategyPattern.domain.flyBehavior.FlyBehavior;
import strategyPattern.domain.quackBehavior.QuackBehavior;

public class RedHeadDuck extends Duck {

  public RedHeadDuck(
      FlyBehavior flyBehavior,
      QuackBehavior quackBehavior
  ) {
    super(flyBehavior, quackBehavior);
  }

  public void display() {
    System.out.println("I'm a real Red Headed duck");
  }

}
