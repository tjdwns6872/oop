package training.strategy_1;

public class PaypalPayment implements PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("PayPal로 "+amount+"원을 결제합니다.");
    }
    
}
