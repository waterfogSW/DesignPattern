package strategyPattern.domain.flyBehavior;

public class FlyNoWay implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("Cannot fly");
  }

}
