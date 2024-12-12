package training.strategy_1;

public class CardPayment implements PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("카드로 "+amount+"원을 결제합니다.");
    }
    
}
