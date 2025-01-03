package training.factoryStrategy_1;

public class BankTransferFactory extends PaymentFactory{

    @Override
    public PaymentStrategy createPaymentStrategy() {
        return new BankTransfer();
    }
    
}
