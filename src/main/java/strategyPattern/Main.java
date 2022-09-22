package strategyPattern;

import strategyPattern.domain.duck.DecoyDuck;
import strategyPattern.domain.duck.Duck;
import strategyPattern.domain.duck.MallardDuck;
import strategyPattern.domain.duck.RedHeadDuck;
import strategyPattern.domain.duck.RubberDuck;
import strategyPattern.domain.flyBehavior.FlyNoWay;
import strategyPattern.domain.flyBehavior.FlyWithWings;
import strategyPattern.domain.quackBehavior.MuteQuack;
import strategyPattern.domain.quackBehavior.Quack;
import strategyPattern.domain.quackBehavior.Squeak;

public class Main {

  public static void main(String[] args) {

    Duck mallard = new MallardDuck();
    mallard.display();
    mallard.quack();
    mallard.fly();
    mallard.swim();

    Duck redHead = new RedHeadDuck();
    redHead.display();
    redHead.quack();
    redHead.fly();
    redHead.swim();

    Duck rubberDuck = new RubberDuck();
    rubberDuck.display();
    rubberDuck.quack();
    rubberDuck.fly();
    rubberDuck.swim();

    Duck decoyDuck = new DecoyDuck();
    decoyDuck.display();
    decoyDuck.quack();
    decoyDuck.fly();
    decoyDuck.swim();

  }

}
