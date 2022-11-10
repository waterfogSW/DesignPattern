package singleton;

public class ChocolateController {

  public static void main(String[] args) {
    Runnable runnable = () -> {
      ChocolateBoiler boiler = ChocolateBoiler.getInstance();
      boiler.fill();
      boiler.boil();
      boiler.drain();
    };

    Thread thread1 = new Thread(runnable);
    Thread thread2 = new Thread(runnable);
    thread1.start();
    thread2.start();
  }

}
