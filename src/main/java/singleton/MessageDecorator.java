package singleton;

public class MessageDecorator implements AddComponent{

  private final AddComponent component;

  public MessageDecorator() {
    this.component = Singleton.getInstance();
  }

  @Override
  public int add(int x, int y) {
    System.out.println("더하기");
    return component.add(x, y);
  }

}
