package newStudyFile.day_9.model.discount;

public class MemberDiscount implements DiscountStrategy{

    private int percent;

    public MemberDiscount(){
        this.percent = 10;
    }

    @Override
    public int applyDiscount(int totalPrice) {
        return totalPrice - (totalPrice * percent / 100);
    }

    @Override
    public String getDiscount() {
        return "[회원 할인] "+ percent+"%";
    }
    
}
