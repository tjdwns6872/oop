package training.factoryStrategy_2;

public class RatioDiscount implements DiscountStrategy{

    @Override
    public double discount(Integer price) {
        double data = (double)getType().getDiscountData()/100*price;
        double total = price-data;
        return total;
    }

    @Override
    public DiscountEnum getType() {
        return DiscountEnum.ratio;
    }
    
}
