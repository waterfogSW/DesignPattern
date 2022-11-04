package strategy.domain.duck;

import strategy.domain.flyBehavior.FlyBehavior;
import strategy.domain.quackBehavior.QuackBehavior;

public abstract class Duck {

  private final FlyBehavior flyBehavior;
  private final QuackBehavior quackBehavior;

  public Duck(
      FlyBehavior flyBehavior,
      QuackBehavior quackBehavior
  ) {
    this.flyBehavior = flyBehavior;
    this.quackBehavior = quackBehavior;
  }

  public abstract void display();

  public void fly() {
    flyBehavior.fly();
  }

  public void quack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }

}
