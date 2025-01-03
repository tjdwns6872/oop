package training.factoryStrategy_1;

public enum TypeEnum {
    CREDIT_CARD("카드 결제"), PAYPAL("페이팔 결제"), BANK_TRANSFER("계좌 이체");

    private final String displayName;

    TypeEnum(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }
}
