package newStudyFile.day_8_2.discount;

public class FlatDiscount implements DiscountStrategy{

    private int percent;

    public FlatDiscount(int percent){
        this.percent = percent;
    }

    @Override
    public int applyDiscount(int price) {
        System.out.println("[할인 적용] "+percent+"원 할인 적용됨");
        return price - percent;
    }
    
}
