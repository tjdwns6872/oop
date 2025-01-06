package training.factoryStrategy_2;

public class CreditCardFactory extends PaymentFactory{

    @Override
    public PaymentStrategy createPaymentFactory() {
        return new CreditCard();
    }
    
}
