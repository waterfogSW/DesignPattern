package composite;

public class Leaf implements Component{

  @Override
  public void operation() {
    System.out.println("I am leaf");
  }

}
