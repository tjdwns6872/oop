package newStudyFile.threeDay.Payment;

public class PaymentContext {
    
    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void execute(){
        paymentStrategy.pay();
    }
}
