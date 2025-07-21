package newStudyFile.day_8_2.message;

import newStudyFile.day_8_2.order.Order;

public class MemoDecorator extends OrderDecorator{

    private String message;

    public MemoDecorator(Order decoratedOrder, String message) {
        super(decoratedOrder);
        this.message = message;
    }

    @Override
    public String getDetails() {
        return decoratedOrder.getDetails()+"\n[배송 메모] "+ message;
    }
    
}
