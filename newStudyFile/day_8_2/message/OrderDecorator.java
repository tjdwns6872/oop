package newStudyFile.day_8_2.message;

import newStudyFile.day_8_2.discount.DiscountStrategy;
import newStudyFile.day_8_2.order.Order;

// OrderDecorator.java
public abstract class OrderDecorator extends Order {
    protected Order decoratedOrder;

    public OrderDecorator(Order decoratedOrder) {
        this.decoratedOrder = decoratedOrder;
    }

    @Override
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        decoratedOrder.setDiscountStrategy(discountStrategy);
    }

    @Override
    public void setMoney(int price) {
        decoratedOrder.setMoney(price);
    }

    @Override
    public int getTotalPrice() {
        return decoratedOrder.getTotalPrice();
    }
}

