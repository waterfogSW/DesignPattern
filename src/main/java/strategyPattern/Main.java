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

    Duck mallard = new MallardDuck(new FlyWithWings(), new Quack());
    mallard.display();
    mallard.quack();
    mallard.fly();
    mallard.swim();

    Duck redHead = new RedHeadDuck(new FlyWithWings(), new Squeak());
    redHead.display();
    redHead.quack();
    redHead.fly();
    redHead.swim();

    Duck rubberDuck = new RubberDuck(new FlyNoWay(), new Quack());
    rubberDuck.display();
    rubberDuck.quack();
    rubberDuck.fly();
    rubberDuck.swim();

    Duck decoyDuck = new DecoyDuck(new FlyNoWay(), new MuteQuack());
    decoyDuck.display();
    decoyDuck.quack();
    decoyDuck.fly();
    decoyDuck.swim();

  }

}
