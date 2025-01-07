package training.factoryStrategy_2;

public class start {
    public static void main(String[] args) {
        // 배송 방식 선택
        DeliveryFactory deliveryFactory = new NextDayDeliveryFactory();
        DeliveryStrategy delivery = deliveryFactory.createDeliveryFactory();

        // 결제 방식 선택
        PaymentFactory paymentFactory = new PayPalFactory();
        PaymentStrategy payment = paymentFactory.createPaymentFactory();

        DiscountStrategy discountStrategy = new DiscountProvider().getDiscountStrategy(DiscountEnum.ratio);

        // // 주문 처리
        OrderProcessor orderProcessor = new OrderProcessor(payment, delivery, discountStrategy);
        orderProcessor.processOrder(120);
    }
}
