package training.factoryStrategy_1;

public class BankTransfer implements PaymentStrategy{

    private static final String BANK_TRANSFER = "계좌 이체";

    public BankTransfer() {
        System.out.println("계좌 정보를 확인 후 결제");
    }

    @Override
    public void pay(double price) {
        PayHelper helper = new PayHelper();
        helper.pay(this, price);
    }

    @Override
    public boolean effectivenessCheck() {
        //계좌 정보 유효성 검사 로직
        return true;
    }

    @Override
    public TypeEnum getType() {
        return TypeEnum.BANK_TRANSFER;
    }
    
}
