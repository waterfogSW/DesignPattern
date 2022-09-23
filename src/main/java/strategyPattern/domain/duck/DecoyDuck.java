package strategyPattern.domain.duck;

import strategyPattern.domain.flyBehavior.FlyNoWay;
import strategyPattern.domain.quackBehavior.MuteQuack;

public class DecoyDuck extends Duck {

  public DecoyDuck() {
    super(new FlyNoWay(), new MuteQuack());
  }

  @Override
  public void display() {
    System.out.println("I'm a duck Decoy");
  }

}
