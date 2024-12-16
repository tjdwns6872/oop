package training.abs_builder_1;

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

        sb.append("Pizza Details:\n");
        sb.append("Dough: ");
        sb.append(dough);
        sb.append("\nSauce: ");
        sb.append(sauce);
        sb.append("\nCheese: ");
        sb.append(cheese);
        sb.append("\nToppings: ");

        for(String topping : toppings){
            sb.append(topping);
            if(comma < toppings.size()){
                sb.append(", ");
                comma++;
            }
        }

        System.out.println(sb.toString());
    }
}