package training.abs_builder_1;

import java.util.ArrayList;
import java.util.List;

public class Cheese implements Composition{

    private List<String> cheeses;

    public Cheese(){
        this.cheeses = new ArrayList<>();
        this.cheeses.add("Mozzarella");
        this.cheeses.add("Cheddar");
        this.cheeses.add("Parmesan");
    }

    @Override
    public List<String> getList() {
        return this.cheeses;
    }
    
}
