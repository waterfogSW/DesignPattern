package singleton;

public class Singleton implements AddComponent {

  private static Singleton instance;

  private Singleton() {}

  public static Singleton getInstance() {
    Singleton result = instance;
    if (result != null) {
      return result;
    }
    synchronized (Singleton.class) {
      if (instance == null) {
        instance = new Singleton();
      }
      return instance;
    }
  }

  @Override
  public int add(int x, int y) {
    return x + y;
  }

}
