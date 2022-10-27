package test_2022_10_27;

public class MyPizzaStore {

    private final PizzaFactory pizzaFactory;

    public MyPizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> pizzaFactory.getCheesePizza();
            case "pepperoni" -> pizzaFactory.getPepperoniPizza();
            case "clam" -> pizzaFactory.getClamPizza();
            case "veggie" -> pizzaFactory.getVeggiePizza();
            default -> null;
        };
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
