package training.abs_builder_1;

import java.util.List;

public class Validation {
    
    public Validation(){}

    public void check(List<String> list, String check, String type){
        if(!list.contains(check)){
            throw new IllegalArgumentException("Invalid "+type+" type: "+check);
        }
    }

    public void checkTopping(List<String> list, String check){
        if(!list.contains(check)){
            throw new IllegalArgumentException("Toppings Not Available: "+check);
        }
    }
}
