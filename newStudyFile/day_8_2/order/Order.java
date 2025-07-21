package newStudyFile.day_8_2.order;

import newStudyFile.day_8_2.discount.DiscountStrategy;

public abstract class Order {

    protected DiscountStrategy discountStrategy;
    protected int totalPrice = 0;

    public void setDiscountStrategy(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }

    public void setMoney(int price){
        this.totalPrice += price;
    }

    public int getTotalPrice(){
        return discountStrategy != null
            ? discountStrategy.applyDiscount(totalPrice)
            : totalPrice;
    }
    public abstract String getDetails();
    
}
