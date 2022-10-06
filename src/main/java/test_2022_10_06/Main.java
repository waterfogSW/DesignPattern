package test_2022_10_06;

public class Main {

  public static void main(String[] args) {
    Cell one = new Cell("one");
    Cell two = new Cell("two");
    Cell three = new Cell("three");

    one.addCell(three);
    two.addCell(three);

    one.display();
    two.display();
    three.display();

    one.setMessage("One is changed");
    one.display();
    two.display();
    three.display();

    two.setMessage("Two is changed");
    one.display();
    two.display();
    three.display();

    Cell four = new Cell("Four");
    one.addCell(four);
    three.addCell(four);
  }
}
