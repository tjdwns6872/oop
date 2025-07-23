package newStudyFile.day_9.model.discount;

public class NoDiscount implements DiscountStrategy{

    @Override
    public int applyDiscount(int totalPrice) {
        return totalPrice;
    }

    @Override
    public String getDiscount() {
        return "[비회원 할인] 0%";
    }
    
}
