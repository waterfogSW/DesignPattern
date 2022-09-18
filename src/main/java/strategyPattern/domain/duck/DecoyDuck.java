package strategyPattern.domain.duck;

import strategyPattern.domain.flyBehavior.FlyBehavior;
import strategyPattern.domain.quackBehavior.QuackBehavior;

public class DecoyDuck extends Duck {

  public DecoyDuck(
      FlyBehavior flyBehavior,
      QuackBehavior quackBehavior
  ) {
    super(flyBehavior, quackBehavior);
  }

  @Override
  public void display() {
    System.out.println("DecoyDuck");
  }

}
