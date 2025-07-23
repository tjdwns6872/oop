package newStudyFile.day_9.model.order;

public class OrderFactory {
    
    public Order createOrder(String type){
        switch (type) {
            case "NormalOrder":
                return new NormalOrder();
            case "SubscriptionOrder":
                return new SubscriptionOrder();
            default:
                throw new IllegalArgumentException("존재하지 않는 주문 방식입니다.");
        }
    }
}
