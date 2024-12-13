package training.builder_2;

import java.util.ArrayList;
import java.util.List;

public class BurgerBuilder {

    private String bun;
    private String patty;
    private List<String> topping;
    private String sauce;

    public BurgerBuilder(){
        topping = new ArrayList<>();
    }

    public BurgerBuilder setBun(String bun){
        this.bun = bun;
        return this;
    }

    public BurgerBuilder setPatty(String patty){
        this.patty = patty;
        return this;
    }

    public BurgerBuilder addTopping(String topping){
        this.topping.add(topping);
        return this;
    }

    public BurgerBuilder setSauce(String sauce){
        this.sauce = sauce;
        return this;
    }

    public Burger build() throws Exception{
        List<String> bunList = new Bun().getList();
        List<String> pattyList = new Patty().getList();
        List<String> sauceList = new Sauce().getList();
        List<String> toppingList = new Topping().getList();

        Validation validation = new Validation();
        validation.validation(bunList, bun, "bun");
        validation.validation(pattyList, patty, "patty");
        validation.validation(sauceList, sauce, "sauce");
        for(String top : topping){
            validation.validation(toppingList, top, "topping");
        }

        return new Burger(bun, patty, topping, sauce);
    }
}
