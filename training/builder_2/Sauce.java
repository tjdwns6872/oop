package training.builder_2;

import java.util.ArrayList;
import java.util.List;

public class Sauce implements Composition{

    private List<String> sauces;

    public Sauce(){
        sauces = new ArrayList<>();
        sauces.add("Ketchup");
        sauces.add("Mayo");
        sauces.add("Mustard");
        sauces.add("BBQ");
    }

    @Override
    public List<String> getList() {
        return sauces;
    }
    
}
