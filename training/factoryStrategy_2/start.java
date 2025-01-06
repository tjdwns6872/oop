package training.factoryStrategy_2;

public class start {
    public static void main(String[] args) {
        // 배송 방식 선택
        DeliveryFactory deliveryFactory = new StandardDeliveryFactory();
        DeliveryStrategy delivery = deliveryFactory.createDeliveryFactory();

        // 결제 방식 선택
        PaymentFactory paymentFactory = new CreditCardFactory();
        PaymentStrategy payment = paymentFactory.createPaymentFactory();

        // // 주문 처리
        OrderProcessor orderProcessor = new OrderProcessor(payment, delivery);
        orderProcessor.processOrder(100); // 주문 금액: $100
    }
}
