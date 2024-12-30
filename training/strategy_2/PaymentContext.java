package training.strategy_2;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;
    
    public void setPaymentStrategy(PaymentStrategy strategy){
        this.paymentStrategy = strategy;
    }

    public void executePayment(double amount){
        if(paymentStrategy == null){
            throw new IllegalStateException("결제 전략이 설정되지 않았습니다.");
        }
        paymentStrategy.pay(amount);
    }
}
