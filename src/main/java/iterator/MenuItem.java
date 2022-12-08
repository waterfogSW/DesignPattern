package iterator;

public class MenuItem {

  String name;
  String description;
  boolean vegetarian;
  double price;

  public MenuItem(
      String name,
      String description,
      boolean vegetarian,
      double price
  ) {
    this.name = name;
    this.description = description;
    this.vegetarian = vegetarian;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public boolean isVegetarian() {
    return vegetarian;
  }

  public void display() {
    System.out.print(getName());
    System.out.println("\t\t" + getPrice());
    System.out.println("\t" + getDescription());
  }

  public String toString() {
    return (name + ", $" + price + "\n   " + description);
  }

}