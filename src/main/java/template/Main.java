package template;

public class Main {

  public static void main(String[] args) {
    TemplateMethod hello = new TemplateMethod(() -> System.out.println("hello"));
    hello.run();
  }

}
