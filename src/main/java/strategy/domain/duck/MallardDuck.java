package strategy.domain.duck;

import strategy.domain.flyBehavior.FlyWithWings;
import strategy.domain.quackBehavior.Quack;

public class MallardDuck extends Duck {

  public MallardDuck() {
    super(new FlyWithWings(), new Quack());
  }

  public void display() {
    System.out.println("I'm a real Mallard duck");
  }

}
