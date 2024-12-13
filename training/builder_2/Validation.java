package training.builder_2;

import java.util.List;

public class Validation {
    
    public void validation(List<String> list, String check, String type){
        if(!list.contains(check)){
            throw new IllegalArgumentException("Invalid "+type+" type: " + check);
        }
    }
}
