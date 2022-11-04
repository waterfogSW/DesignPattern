package strategy.domain.quackBehavior;

public class FakeQuack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Qwak");
  }

}
