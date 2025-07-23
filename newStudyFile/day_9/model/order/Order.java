package newStudyFile.day_9.model.order;

import newStudyFile.day_9.model.discount.DiscountStrategy;
import newStudyFile.day_9.model.discount.MemberDiscount;
import newStudyFile.day_9.model.discount.NoDiscount;

public abstract class Order {
    
    protected DiscountStrategy discountStrategy;
    protected int totalPrice;

    public void setDiscountStrategy(boolean isMember){
        if (isMember) {
            this.discountStrategy = new MemberDiscount();
        }else{
            this.discountStrategy = new NoDiscount();
        }
    }

    public void setTotalPrice(int totalPrice){
        this.totalPrice = totalPrice;
    }

    public int getTotalPrice(){
        return this.discountStrategy != null
            ? this.discountStrategy.applyDiscount(totalPrice)
            : totalPrice;
    }

    public abstract String getDetails();

    public String getDiscount(){
        return discountStrategy.getDiscount();
    }
    
}
