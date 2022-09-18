package strategyPattern.domain.quackBehavior;

public class Squeak implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Squeak");
  }

}
