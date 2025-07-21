package newStudyFile.day_8_2.discount;

public class PercentageDiscount implements DiscountStrategy{

    private int percent;

    public PercentageDiscount(int percent){
        this.percent = percent;
    }

    @Override
    public int applyDiscount(int price) {
        System.out.println("[할인 적용] "+percent+"% 할인 적용됨");
        return price - (price * percent / 100);
    }
    
}
