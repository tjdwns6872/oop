package training.factoryStrategy_2;

public interface DiscountStrategy {

    public double discount(Integer price);

    public DiscountEnum getType();
}
