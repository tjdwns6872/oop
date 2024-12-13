package training.builder_2;

public class start {
    public static void main(String[] args) throws Exception {
        
        Burger burger = new BurgerBuilder()
                .setBun("Sesame")
                .setPatty("Beef")
                .addTopping("Lettuce")
                .addTopping("Tomato")
                .addTopping("Cheese")
                .setSauce("Ketchup")
                .build();

        burger.printDetails();
        
    }
}
