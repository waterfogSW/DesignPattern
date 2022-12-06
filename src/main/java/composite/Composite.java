package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

  private final List<Component> components;

  public Composite() {
    this.components = new ArrayList<>();
  }

  public List<Component> getChild() {
    return components;
  }

  public void add(Component component) {
    components.add(component);
  }

  public void remove(Component component) {
    components.remove(component);
  }

  @Override
  public void operation() {
    System.out.println("I am composite");
  }

}
