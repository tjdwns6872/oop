package training.factoryStrategy_2;

public class BankTransferFactory extends PaymentFactory{

    @Override
    public PaymentStrategy createPaymentFactory() {
        return new BankTransfer();
    }
    
}
