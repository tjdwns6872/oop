package training.strategy_1;

public class PaymentProcessor {
    
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy){
        paymentStrategy = strategy;
    }

    public void payAmount(int amount){
        paymentStrategy.pay(amount);
    }
}
