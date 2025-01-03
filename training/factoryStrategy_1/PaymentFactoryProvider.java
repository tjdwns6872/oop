package training.factoryStrategy_1;

public class PaymentFactoryProvider {
    
    public static PaymentFactory getFactory(TypeEnum type){
        switch (type) {
            case CREDIT_CARD:
                return new CardFactory();
            case PAYPAL:
                return new PaypalFactory();
            case BANK_TRANSFER:
                return new BankTransferFactory();
            default:
                throw new IllegalArgumentException("존재하지 않는 결제 방식입니다.");
        }
    }
}
