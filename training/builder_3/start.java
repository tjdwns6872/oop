package training.builder_3;

public class start {

    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder()
            .setDough("Thin")
            .setSauce("Tomato")
            .setCheese("Mozzarella")
            .setTopping("Pepperoni")
            .setTopping("Mushrooms")
            .build();
        
        pizza.printDetails();
    }
    
}
