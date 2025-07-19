package newStudyFile.day_3.Payment;

public class KakaoPay implements PaymentStrategy{

    @Override
    public void pay() {
        System.out.println("[결제] 카카오페이 처리 완료");
    }
    
}
