package training.factoryStrategy_2;

public class PayPalFactory extends PaymentFactory{

    @Override
    public PaymentStrategy createPaymentFactory() {
        return new PayPal();
    }
    
}
