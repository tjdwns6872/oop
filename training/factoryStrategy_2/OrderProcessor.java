package training.factoryStrategy_2;

public class OrderProcessor {
    
    private PaymentStrategy payStrategy;
    private DeliveryStrategy delStrategy;
    private DiscountStrategy disStrategy;
    private MessageHelper message;

    public OrderProcessor(PaymentStrategy payStrategy, DeliveryStrategy delStrategy, DiscountStrategy disStrategy){
        this.payStrategy = payStrategy;
        this.delStrategy = delStrategy;
        this.disStrategy = disStrategy;
        this.message = MessageHelper.getInstance();
    }

    public void processOrder(Integer price){
        deliveryPrice(delStrategy.getType());
        paymentMessage(payStrategy.getType());
        totalPrice(price);
    }
    
    public void deliveryPrice(DeliveryEnum type){
        String title = type.getName();
        String context = "$ "+type.getCharge()+" 배송 비용";
        message.printMessage(title, context);
    }

    public void paymentMessage(PaymentEnum type){
        String title = type.getDisplayName();
        String context = "유효성 검사 완료";
        if(check(type)){
            message.printMessage(title, context);
        }else{
            throw new IllegalArgumentException("유효성 검사 실패");
        }
    }

    public void totalPrice(Integer price){
        double total = this.disStrategy.discount(price+delStrategy.getCharge());
        String context = String.format("총 결제 금액: $%.2f", total);
        message.printMessage(context);
    }

    public boolean check(PaymentEnum type){
        // 유효성 검사 로직
        return true;
    }
}
