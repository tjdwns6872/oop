package training.abs_builder_1;

import java.util.ArrayList;
import java.util.List;

public class ItalianPizzaFactory implements PizzaComposition{
    
    private static final String dough = "Thin";
    private static final String sauce = "Pesto";
    private String cheese = "Mozzarella";
    private List<String> toppings;

    public ItalianPizzaFactory(){

        toppings = new ArrayList<>();
        this.toppings.add("Chicken");
        this.toppings.add("Jalapenos");
        this.toppings.add("Pineapple");

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
