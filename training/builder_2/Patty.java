package training.builder_2;

import java.util.ArrayList;
import java.util.List;

public class Patty implements Composition{

    private List<String> pattys;

    public Patty(){
        pattys = new ArrayList<>();
        pattys.add("Beef");
        pattys.add("Chicken");
        pattys.add("Veggie");
    }

    @Override
    public List<String> getList() {
        return pattys;
    }
    
}
