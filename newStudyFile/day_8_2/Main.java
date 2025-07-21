package newStudyFile.day_8_2;

import newStudyFile.day_8_2.discount.PercentageDiscount;
import newStudyFile.day_8_2.message.CouponDecorator;
import newStudyFile.day_8_2.message.MemoDecorator;
import newStudyFile.day_8_2.order.Order;
import newStudyFile.day_8_2.order.OrderEnum;
import newStudyFile.day_8_2.order.OrderFactory;
import newStudyFile.day_8_2.orderSystem.DeliveryNotifier;
import newStudyFile.day_8_2.orderSystem.MarketingNotifier;
import newStudyFile.day_8_2.orderSystem.OrderPublisher;

public class Main {
    public static void main(String[] args) {
        OrderPublisher publisher = new OrderPublisher();

        Order order = OrderFactory.createOrder(OrderEnum.NormalOrder);
        order.setMoney(1000);
        order.setMoney(5000);
        order.setMoney(3000);
        order.setDiscountStrategy(new PercentageDiscount(10));
        order = new CouponDecorator(order, "WELCOME10");
        order = new MemoDecorator(order, "경비실에 맡겨주세요");

        System.out.println(order.getDetails());

        publisher.subscribe(new DeliveryNotifier(), "주문 준비 시작");
        publisher.subscribe(new MarketingNotifier(), "구독자 신규 유입");

        publisher.notifyObservers();
    }
}
