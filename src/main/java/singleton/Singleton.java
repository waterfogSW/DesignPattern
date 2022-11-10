package singleton;

public class Singleton implements AddComponent {

  private static Singleton instance;

  protected Singleton() {}

  public static Singleton getInstance() {
    if (instance == null) {
      return instance = new Singleton();
    }
    return instance;
  }

  @Override
  public int add(int x, int y) {
    return x + y;
  }

}
