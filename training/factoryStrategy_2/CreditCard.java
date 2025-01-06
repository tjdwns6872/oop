package training.factoryStrategy_2;

public class CreditCard implements PaymentStrategy{

    @Override
    public PaymentEnum getType() {
        return PaymentEnum.CreditCard;
    }
    
}
