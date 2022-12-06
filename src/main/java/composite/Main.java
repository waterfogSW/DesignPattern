package composite;

public class Main {

  public static void main(String[] args) {
    Composite composite = new Composite();

    Leaf leaf1 = new Leaf();
    Leaf leaf2 = new Leaf();
    Composite childComposite = new Composite();

    composite.add(leaf1);
    composite.add(leaf2);
    composite.add(childComposite);

    composite.getChild()
             .forEach(Component::operation);
  }
}
