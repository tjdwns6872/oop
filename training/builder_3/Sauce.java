package training.builder_3;

import java.util.ArrayList;
import java.util.List;

public class Sauce implements Composition {

    private List<String> sauceList;

    public Sauce(){
        sauceList = new ArrayList<>();
        sauceList.add("Tomato");
        sauceList.add("Cream");
        sauceList.add("Pesto");
    }

    @Override
    public List<String> getList() {
        return sauceList;
    }
    
}
