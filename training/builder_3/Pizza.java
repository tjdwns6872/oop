package training.builder_3;

import java.util.List;

public class Pizza {
    
    private String dough;
    private String sauce;
    private String cheese;
    private List<String> toppings;

    public Pizza(String dough, String sauce, String cheese, List<String> toppings){
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
    }

    public void printDetails(){
        StringBuilder sb = new StringBuilder();
        int comma = 1;
        System.out.println("Pizza Details:");
        System.out.println("Dough: "+dough);
        System.out.println("Sauce: "+sauce);
        System.out.println("Cheese: "+cheese);

        for(String topping : toppings){
            sb.append(topping);
            if(comma < toppings.size()){
                sb.append(", ");
                comma++;
            }
        }
        System.out.println("Toppings: "+sb.toString());

    }
}
