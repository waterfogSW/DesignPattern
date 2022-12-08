package composite;

public class Leaf implements Component {

  @Override
  public void display() {
    System.out.println("hello world");
  }

}
