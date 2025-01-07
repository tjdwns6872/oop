package training.factoryStrategy_2;

public class OrderProcessor {
    
    private PaymentStrategy payStrategy;
    private DeliveryStrategy delStrategy;
    private DiscountStrategy disStrategy;

    public OrderProcessor(PaymentStrategy payStrategy, DeliveryStrategy delStrategy, DiscountStrategy disStrategy){
        this.payStrategy = payStrategy;
        this.delStrategy = delStrategy;
        this.disStrategy = disStrategy;
    }

    public void processOrder(Integer price){
        deliveryPrice(delStrategy.getType());
        paymentMessage(payStrategy.getType());
        totalPrice(price);
    }
    
    public void deliveryPrice(DeliveryEnum type){
        StringBuilder sb = new StringBuilder();
        sb.append("["+type.getName()+" 배송] $");
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
        double total = this.disStrategy.discount(price+delStrategy.getCharge());
        System.out.println("총 결제 금액: $"+ total);
    }

    public boolean check(PaymentEnum type){
        // 유효성 검사 로직
        return true;
    }
}
