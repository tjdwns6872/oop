package training.factoryStrategy_4;

public class RegularStrategy implements CustomerStrategy{

    @Override
    public double discountPolicy(Integer discount, Integer price) {
        double data = (double)discount/100*price;
        double total = price-data;
        return total;
    }
    
}
