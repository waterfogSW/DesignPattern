package template;

public class TemplateMethod {

  private final Function function;

  public TemplateMethod(Function function) {
    this.function = function;
  }

  public void run() {
    System.out.println("시작");
    function.execute();
    System.out.println("끝");

  }


}
