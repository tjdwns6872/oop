package training.builder_3;

import java.util.ArrayList;
import java.util.List;

public class Toppings implements Composition{

    private List<String> toppingList;

    public Toppings(){
        toppingList = new ArrayList<>();
        toppingList.add("Pepperoni");
        toppingList.add("Mushrooms");
        toppingList.add("Olives");
        toppingList.add("Jalapenos");
        toppingList.add("Pineapple");
        toppingList.add("Chicken");
    }

    @Override
    public List<String> getList() {
        return toppingList;
    }
    
}
