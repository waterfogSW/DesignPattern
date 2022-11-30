package iterator;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator<MenuItem> {

  private final MenuItem[] menuItems;
  private int idx;

  public DinnerMenuIterator(MenuItem[] menuItems) {
    this.menuItems = menuItems;
    this.idx = 0;
  }

  public MenuItem next() {
    MenuItem menuItem = menuItems[idx];
    idx++;
    return menuItem;
  }

  @Override
  public boolean hasNext() {
    return menuItems.length > idx;
  }

}
