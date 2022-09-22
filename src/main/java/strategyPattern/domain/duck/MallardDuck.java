package strategyPattern.domain.duck;

import strategyPattern.domain.flyBehavior.FlyWithWings;
import strategyPattern.domain.quackBehavior.Quack;

public class MallardDuck extends Duck {

  public MallardDuck() {
    super(new FlyWithWings(), new Quack());
  }

  public void display() {
    System.out.println("I'm a real Mallard duck");
  }

}
