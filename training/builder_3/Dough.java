package training.builder_3;

import java.util.ArrayList;
import java.util.List;

public class Dough implements Composition{

    private List<String> doughList;

    public Dough(){
        doughList = new ArrayList<>();
        doughList.add("Thin");
        doughList.add("Thick");
        doughList.add("Cheese-filled");
    }

    @Override
    public List<String> getList() {
        return doughList;
    }
    
}
