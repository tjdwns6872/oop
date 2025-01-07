package training.factoryStrategy_2;

public class FixDiscount implements DiscountStrategy{

    @Override
    public double discount(Integer price) {
        double data = (double)getType().getDiscountData();
        double total = price-data;
        return total;
    }

    @Override
    public DiscountEnum getType() {
        return DiscountEnum.Fix;
    }
    
}
