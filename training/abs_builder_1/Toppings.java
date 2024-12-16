package training.abs_builder_1;

import java.util.ArrayList;
import java.util.List;

public class Toppings implements Composition{

    private List<String> toppings;

    public Toppings(){
        this.toppings = new ArrayList<>();
        this.toppings.add("Pepperoni");
        this.toppings.add("Mushrooms");
        this.toppings.add("Olives");
        this.toppings.add("Jalapenos");
        this.toppings.add("Pineapple");
        this.toppings.add("Chicken");
    }

    @Override
    public List<String> getList() {
        return this.toppings;
    }
    
}
