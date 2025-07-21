package newStudyFile.day_8_2.message;

import newStudyFile.day_8_2.order.Order;

public class CouponDecorator extends OrderDecorator{

    private String message;

    public CouponDecorator(Order decoratedOrder, String message) {
        super(decoratedOrder);
        this.message = message;
    }

    @Override
    public String getDetails() {
        return decoratedOrder.getDetails()+"\n[쿠폰 적용] 쿠폰: "+ message;
    }
    
}
