package strategyPattern.domain.quackBehavior;

public class MuteQuack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("mute");
  }

}
