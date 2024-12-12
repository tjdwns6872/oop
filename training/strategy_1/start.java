package training.strategy_1;

public class start {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        
        // 카드 결제
        processor.setPaymentStrategy(new CardPayment());
        processor.payAmount(50000);
        
        // PayPal 결제
        processor.setPaymentStrategy(new PaypalPayment());
        processor.payAmount(30000);
        
        // 은행 이체
        processor.setPaymentStrategy(new BankTransfer());
        processor.payAmount(100000);
    }
}