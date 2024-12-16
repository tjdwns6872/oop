package training.abs_builder_1;

import java.util.ArrayList;
import java.util.List;

public class AmericanPizzaFactory implements PizzaComposition{

    private static final String dough = "Thick";
    private static final String sauce = "Tomato";
    private String cheese = "Cheddar";
    private List<String> toppings;

    public AmericanPizzaFactory(){
        toppings = new ArrayList<>();
        this.toppings.add("Pepperoni");
        this.toppings.add("Mushrooms");
        this.toppings.add("Olives");
    }

    public String getDough(){
        return this.dough;
    }

    public String getSauce(){
        return this.sauce;
    }

    public List<String> getToppings(){
        return toppings;
    }

    @Override
    public String getCheese() {
        return this.cheese;
    }
    
}
