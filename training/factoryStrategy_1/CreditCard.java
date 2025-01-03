package training.factoryStrategy_1;

public class CreditCard implements PaymentStrategy{

    private static final String CREDIT_CARD = "카드 결제";

    public CreditCard(){
        System.out.println("카드 번호 유효성 검사 후 결제가 진행됩니다.");
    }

    @Override
    public void pay(double price) {
        PayHelper helper = new PayHelper();
        helper.pay(this, price);
    }

    @Override
    public boolean effectivenessCheck() {
        //카드 번호 유효성 검사 로직
        return true;
    }

    @Override
    public TypeEnum getType() {
        return TypeEnum.CREDIT_CARD;
    }
    
}
