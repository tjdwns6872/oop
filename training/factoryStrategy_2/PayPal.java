package training.factoryStrategy_2;

public class PayPal implements PaymentStrategy{

    @Override
    public PaymentEnum getType() {
        return PaymentEnum.PayPal;
    }
    
}
