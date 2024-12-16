package training.abs_builder_1;

public class PizzaFactory {

    public PizzaComposition getFactory(String type){
        switch (type) {
            case "Italian":
                return new ItalianPizzaFactory();
            case "American":
                return new AmericanPizzaFactory();
            default:
                throw new IllegalArgumentException("Unknown Pizza type: "+ type);
        }
    }
}
