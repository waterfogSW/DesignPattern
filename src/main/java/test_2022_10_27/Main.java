package test_2022_10_27;

public class Main {
    public static void main(String[] argv) {
        MyPizzaStore myPizzaStore = new MyPizzaStore(new NYPizzaFactory());
        myPizzaStore.orderPizza("clam");
        myPizzaStore.orderPizza("cheese");
    }
}
