package training.strategy_2;

public class start {
    
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setPaymentStrategy(new PayPal());
        paymentContext.executePayment(100.0);
    }
}
