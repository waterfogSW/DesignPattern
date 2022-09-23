package strategyPattern;

import strategyPattern.domain.duck.DecoyDuck;
import strategyPattern.domain.duck.Duck;
import strategyPattern.domain.duck.MallardDuck;
import strategyPattern.domain.duck.RubberDuck;

public class DuckSimulator {

  public static void main(String[] args) {

    Duck mallard = new MallardDuck();
    Duck decoyDuck = new DecoyDuck();
    Duck rubberDuck = new RubberDuck();

    mallard.display();
    mallard.fly();
    mallard.quack();
    mallard.swim();

    rubberDuck.display();
    rubberDuck.fly();
    rubberDuck.quack();
    rubberDuck.swim();

    decoyDuck.display();
    decoyDuck.fly();
    decoyDuck.quack();
    decoyDuck.swim();

  }

}
