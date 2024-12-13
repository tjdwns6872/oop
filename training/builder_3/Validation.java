package training.builder_3;

public class Validation {

    public void validation(Composition composition, String check, String type){
        if(!composition.getList().contains(check)){
            throw new IllegalArgumentException("Invalid "+type+" type: "+check);
        }
    }
    
}
