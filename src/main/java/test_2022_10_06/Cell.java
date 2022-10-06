package test_2022_10_06;

public class Cell extends CellObserver {

  private String message;

  public Cell(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
    updateAll();
  }

  public void display() {
    System.out.println(message);
  }

  private void exec() {
    this.message = "\"" + this.message + "\" is changed";
  }

  @Override
  void update() {
    exec();
  }

}
