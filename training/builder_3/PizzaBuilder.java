package training.builder_3;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {

    private String dough;
    private String sauce;
    private String cheese;
    private List<String> toppings;

    public PizzaBuilder(){
        toppings = new ArrayList<>();
    }

    public PizzaBuilder setDough(String dough){
        this.dough = dough;
        return this;
    }

    public PizzaBuilder setSauce(String sauce){
        this.sauce = sauce;
        return this;
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
        Validation check = new Validation();
        Composition doughs = new Dough();
        Composition sauces = new Sauce();
        Composition cheeses = new Cheese();
        Composition topping = new Toppings();

        check.validation(doughs, dough, "dough");
        check.validation(sauces, sauce, "sauce");
        check.validation(cheeses, cheese, "cheese");
        for(String top : toppings){
            check.validation(topping, top, "topping");
        }

        return new Pizza(dough, sauce, cheese, toppings);
    }

}
