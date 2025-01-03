package training.factoryStrategy_1;

public class PaypalFactory extends PaymentFactory{

    @Override
    public PaymentStrategy createPaymentStrategy() {
        return new Paypal();
    }
    
}
