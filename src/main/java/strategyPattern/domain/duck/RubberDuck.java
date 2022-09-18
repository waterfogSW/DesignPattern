package strategyPattern.domain.duck;

import strategyPattern.domain.flyBehavior.FlyBehavior;
import strategyPattern.domain.quackBehavior.QuackBehavior;

public class RubberDuck extends Duck {

  public RubberDuck(
      FlyBehavior flyBehavior,
      QuackBehavior quackBehavior
  ) {
    super(flyBehavior, quackBehavior);
  }

  @Override
  public void display() {
    System.out.println("Rubber Duck");
  }

}
