package newStudyFile.day_3.Payment;

public class PaymentFactory {
    
    public PaymentStrategy createPay(String type){

        switch (type) {
            case "Card":
                return new Card();
            case "KakaoPay":
                return new KakaoPay();
            case "BankTransfer":
                return new BankTransfer();
            default:
                throw new IllegalArgumentException("존재하지 않는 결제방식 입니다.");
        }
    }
}
