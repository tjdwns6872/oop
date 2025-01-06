package training.factoryStrategy_2;

public class BankTransfer implements PaymentStrategy{

    @Override
    public PaymentEnum getType() {
        return PaymentEnum.BankTransfer;
    }
    
}
