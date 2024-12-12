package training.strategy_1;

public class BankTransfer implements PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("은행 이체로 "+amount+"원을 결제합니다");
    }
    
}
