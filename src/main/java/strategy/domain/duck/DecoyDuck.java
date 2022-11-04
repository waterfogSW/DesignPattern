package strategy.domain.duck;

import strategy.domain.flyBehavior.FlyNoWay;
import strategy.domain.quackBehavior.MuteQuack;

public class DecoyDuck extends Duck {

  public DecoyDuck() {
    super(new FlyNoWay(), new MuteQuack());
  }

  @Override
  public void display() {
    System.out.println("I'm a duck Decoy");
  }

}
