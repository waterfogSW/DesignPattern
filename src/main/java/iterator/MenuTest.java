package iterator;

import java.util.Iterator;

public class MenuTest {

  public static void main(String[] args) {
    final var pancakeHouseMenu = new PancakeHouseMenu();
    final var dinerMenu = new DinerMenu();

    printMenu(pancakeHouseMenu);
    printMenu(dinerMenu);
  }

  public static void printMenu(Menu menu) {
    Iterator<MenuItem> iterator = menu.createIterator();
    while (iterator.hasNext()) {
      iterator.next()
              .display();
    }
  }

}
