package adaptor;

public class Main {

  public static void main(String[] args) {
    Duck duck = new MallardDuck();
    Duck turkey = new WildTurkeyAdapter();

    System.out.println("I am a duck");
    duck.quack();
    duck.fly();
    System.out.println("I am a turkey");
    turkey.quack();
    turkey.fly();
  }

}
