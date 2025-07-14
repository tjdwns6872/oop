package newStudyFile.threeDay.Payment;

public class Card implements PaymentStrategy{

    @Override
    public void pay() {
        System.out.println("[결제] 카드 결제 처리 완료");
    }
    
}
