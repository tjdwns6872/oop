package newStudyFile.threeDay.Payment;

public class BankTransfer implements PaymentStrategy{

    @Override
    public void pay() {
        System.out.println("[결제] 계좌이체 처리 완료");
    }
    
}
