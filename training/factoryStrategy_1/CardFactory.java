package training.factoryStrategy_1;

public class CardFactory extends PaymentFactory{

    @Override
    public PaymentStrategy createPaymentStrategy() {
        return new CreditCard();
    }
    
}
