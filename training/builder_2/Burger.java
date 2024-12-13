package training.builder_2;

import java.util.List;

public class Burger {
    
    private String bun;
    private String patty;
    private List<String> topping;
    private String sauce;

    public Burger(String bun, String patty, List<String> topping, String sauce){
        this.bun = bun;
        this.patty = patty;
        this.topping = topping;
        this.sauce = sauce;
    }

    public void printDetails(){
        StringBuilder sb = new StringBuilder ();
        int comma = 1;
        for(String top : this.topping){
            sb.append(top);
            if(comma < topping.size()){
                sb.append(", ");
                comma++;
            }
        }
        System.out.println("Burger Details:");
        System.out.println("Bun: "+bun);
        System.out.println("Patty: "+patty);
        System.out.println("Toppings: "+sb.toString());
        System.out.println("Sauce: "+sauce);
    }
}
