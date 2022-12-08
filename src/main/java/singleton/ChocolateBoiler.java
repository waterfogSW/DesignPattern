package singleton;

public class ChocolateBoiler {

  private static volatile ChocolateBoiler instance;

  private boolean empty;
  private boolean boiled;

  private ChocolateBoiler() {
    empty = true;
    boiled = false;
    System.out.println(this);
  }

  public static synchronized ChocolateBoiler getInstance() {
    if (instance == null) {
      return instance = new ChocolateBoiler();
    }
    return instance;
  }

  public void fill() {
    if (isEmpty()) {
      empty = false;
      boiled = false;
      // fill the boiler with a milk/chocolate mixture
    }
  }

  public void drain() {
    if (!isEmpty() && isBoiled()) {
      // drain the boiled milk and chocolate
      empty = true;
    }
  }

  public void boil() {
    if (!isEmpty() && !isBoiled()) {
      // bring the contents to a boil
      boiled = true;
    }
  }

  public boolean isEmpty() {
    return empty;
  }

  public boolean isBoiled() {
    return boiled;
  }

}
