package training.factoryStrategy_2;

public enum PaymentEnum {
    CreditCard("카드 결제"), PayPal("페이팔"), BankTransfer("계좌 이체");

    private final String displayName;

    PaymentEnum(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }
}
