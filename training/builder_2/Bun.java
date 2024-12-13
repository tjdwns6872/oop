package training.builder_2;

import java.util.ArrayList;
import java.util.List;

public class Bun implements Composition{

    private List<String> buns;

    public Bun(){
       buns = new ArrayList<>();
       buns.add("Wheat");
       buns.add("White");
       buns.add("Sesame");
    }

    @Override
    public List<String> getList() {
        return buns;
    }
}
