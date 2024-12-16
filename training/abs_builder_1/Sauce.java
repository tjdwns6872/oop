package training.abs_builder_1;

import java.util.ArrayList;
import java.util.List;

public class Sauce implements Composition{

    private List<String> sauces;

    public Sauce(){
        this.sauces = new ArrayList<>();
        this.sauces.add("Tomato");
        this.sauces.add("Cream");
        this.sauces.add("Pesto");
    }

    @Override
    public List<String> getList() {
        return this.sauces;
    }
    
}
