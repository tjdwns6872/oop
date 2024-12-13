package training.builder_2;

import java.util.ArrayList;
import java.util.List;

public class Topping implements Composition{

    private List<String> toppings;

    public Topping(){
        toppings = new ArrayList<>();
        toppings.add("Lettuce");
        toppings.add("Tomato");
        toppings.add("Cheese");
        toppings.add("Bacon");
        toppings.add("Onion");
    }

    @Override
    public List<String> getList() {
        return toppings;
    }
}
