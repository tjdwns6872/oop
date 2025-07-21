package newStudyFile.day_8_2.discount;

public class NoDiscount implements DiscountStrategy{

    @Override
    public int applyDiscount(int price) {
        return price;
    }
    
}
