package training.decorator_2;

import java.util.HashMap;
import java.util.Map;

public class CoffeeType implements Coffee{

    private static final String ESPRESSO = "Espresso";
    private static final String AMERICANO = "Americano";

    private Map<String, Double> COFFEE_PRICES;

    private String type;

    public CoffeeType(String type){
        this.COFFEE_PRICES = new HashMap<>();
        this.COFFEE_PRICES.put(ESPRESSO, 3.0);
        this.COFFEE_PRICES.put(AMERICANO, 2.5);
        this.type = type;
    }

    @Override
    public String order() {
        return type;
    }

    @Override
    public double total() {
        return COFFEE_PRICES.getOrDefault(type, 0.0);
    }

}
