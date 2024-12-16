package training.abs_builder_1;

public class start {
    
    public static void main(String[] args) {
        PizzaComposition pizzaComposition = new ItalianPizzaFactory();
        Pizza pizza = new PizzaBuilder(pizzaComposition)
            .setCheese("Mozzarella")
            .setTopping("Chicken")
            .build();
        
        pizza.printDetails();
    }
}
