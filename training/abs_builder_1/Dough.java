package training.abs_builder_1;

import java.util.ArrayList;
import java.util.List;

public class Dough implements Composition{
    
    private List<String> doughs;

    public Dough(){
        this.doughs = new ArrayList<>();
        doughs.add("Thin");
        doughs.add("Thick");
        doughs.add("Cheese-filled");
    }

    @Override
    public List<String> getList() {
        return doughs;
    }

}
