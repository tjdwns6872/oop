package training.decorator_1;

public class BasicCoffee implements Coffee{

    @Override
    public double getCost() {
        return 5.0;
    }

    @Override
    public String getDescription() {
        return "Basic Coffee";
    }
    
}
