package strategyPattern.domain.duck;

import strategyPattern.domain.flyBehavior.FlyBehavior;
import strategyPattern.domain.quackBehavior.QuackBehavior;

public class MallardDuck extends Duck {

  public MallardDuck(
      FlyBehavior flyBehavior,
      QuackBehavior quackBehavior
  ) {
    super(flyBehavior, quackBehavior);
  }

  public void display() {
    System.out.println("I'm a real Mallard duck");
  }

}
