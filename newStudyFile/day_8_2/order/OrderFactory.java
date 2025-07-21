package newStudyFile.day_8_2.order;

public class OrderFactory {
    
    public static Order createOrder(OrderEnum type){
        switch (type) {
            case NormalOrder:
                System.out.println("[주문 생성] NormalOrder");
                return new NormalOrder();
            case SubscriptionOrder:
                System.out.println("[주문 생성] SubscriptionOrder");
                return new SubscriptionOrder();
            default:
                throw new IllegalArgumentException("존재하지 않는 주문 방식입니다.");
        }
    }
}
