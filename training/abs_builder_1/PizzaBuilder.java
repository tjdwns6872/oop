package training.abs_builder_1;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {

    private String dough;
    private String sauce;
    private String cheese;
    private List<String> toppings;

    private List<String> customToppings;

    public PizzaBuilder(PizzaComposition pizzaComposition){
        this.toppings = new ArrayList<>();
        this.customToppings = pizzaComposition.getToppings();
        this.dough = pizzaComposition.getDough();
        this.sauce = pizzaComposition.getSauce();
        this.cheese = pizzaComposition.getCheese();
    }

    public PizzaBuilder setCheese(String cheese){
        this.cheese = cheese;
        return this;
    }

    public PizzaBuilder setTopping(String topping){
        this.toppings.add(topping);
        return this;
    }

    public Pizza build(){
        Validation va = new Validation();
        Composition cheeses = new Cheese();
        Composition toppingList = new Toppings();

        va.check(cheeses.getList(), this.cheese, "cheese");
        for(String top : toppings){
            va.check(toppingList.getList(), top, "topping");
        }

        for(String top : toppings){
            va.checkTopping(customToppings, top);
        }

        return new Pizza(dough, sauce, cheese, toppings);
    }
}
