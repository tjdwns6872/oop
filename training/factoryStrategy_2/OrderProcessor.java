package training.factoryStrategy_2;

public class OrderProcessor {
    
    private PaymentStrategy payStrategy;
    private DeliveryStrategy delStrategy;

    public OrderProcessor(PaymentStrategy payStrategy, DeliveryStrategy delStrategy){
        this.payStrategy = payStrategy;
        this.delStrategy = delStrategy;
    }

    public void processOrder(Integer price){
        deliveryPrice(delStrategy.getType());
        paymentMessage(payStrategy.getType());
        totalPrice(price);
    }
    
    public void deliveryPrice(DeliveryEnum type){
        StringBuilder sb = new StringBuilder();
        sb.append("["+type+"] $");
        sb.append(type.getCharge());
        sb.append(" 배송 비용");
        System.out.println(sb.toString());
    }

    public void paymentMessage(PaymentEnum type){
        StringBuilder sb = new StringBuilder();
        sb.append("["+type.getDisplayName()+"] 유효성 검사 완료");
        if(check(type)){
            System.out.println(sb.toString());
        }else{
            throw new IllegalArgumentException("유효성 검사 실패");
        }
    }

    public void totalPrice(Integer price){
        Integer total = productDiscount(price) + delStrategy.getCharge();
        System.out.println("총 결제 금액: $"+ total);
    }

    public Integer productDiscount(Integer price){
        Integer standardPrice = 50;
        Integer discount = 5;

        return price > standardPrice ? price-discount : price;
    }

    public boolean check(PaymentEnum type){
        // 유효성 검사 로직
        return true;
    }
}
