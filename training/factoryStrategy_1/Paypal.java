package training.factoryStrategy_1;

public class Paypal implements PaymentStrategy{

    private static final String PAYPAL = "페이팔 결제";

    public Paypal() {
        System.out.println("계정 이메일을 확인 후 결제");
    }

    @Override
    public void pay(double price) {
        PayHelper helper = new PayHelper();
        helper.pay(this, price);
    }

    @Override
    public boolean effectivenessCheck() {
        // 계정 이메일 유효성 검사 로직
        return true;
    }

    @Override
    public TypeEnum getType() {
        return TypeEnum.PAYPAL;
    }
    
}
