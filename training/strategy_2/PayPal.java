package training.strategy_2;

public class PayPal implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("PayPal로 "+amount+" USD 결제");
    }
    
}
