package strategy;

import strategy.domain.duck.DecoyDuck;
import strategy.domain.duck.Duck;
import strategy.domain.duck.MallardDuck;
import strategy.domain.duck.ModelDuck;
import strategy.domain.duck.RubberDuck;

public class DuckSimulator {

  public static void main(String[] args) {

    Duck mallard = new MallardDuck();
    Duck decoyDuck = new DecoyDuck();
    Duck rubberDuck = new RubberDuck();
    Duck modelDuck = new ModelDuck();

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

    modelDuck.display();
    modelDuck.fly();
    modelDuck.quack();
    modelDuck.swim();

  }

}
