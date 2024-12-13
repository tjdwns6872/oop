package training.builder_3;

import java.util.ArrayList;
import java.util.List;

public class Cheese implements Composition{

    private List<String> cheeseList;

    public Cheese(){
        cheeseList = new ArrayList<>();
        cheeseList.add("Mozzarella");
        cheeseList.add("Cheddar");
        cheeseList.add("Parmesan");
    }

    @Override
    public List<String> getList() {
        return cheeseList;
    }

    
}
