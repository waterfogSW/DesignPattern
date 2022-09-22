package strategyPattern.domain.duck;

import strategyPattern.domain.flyBehavior.FlyNoWay;
import strategyPattern.domain.quackBehavior.Quack;

public class RubberDuck extends Duck {

  public RubberDuck() {
    super(new FlyNoWay(), new Quack());
  }

  @Override
  public void display() {
    System.out.println("Rubber Duck");
  }

}
