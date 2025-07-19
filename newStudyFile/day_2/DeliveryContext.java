package newStudyFile.day_2;

public class DeliveryContext {
    private DeliveryStrategy strategy;
    public DeliveryContext(DeliveryStrategy strategy){
        this.strategy = strategy;
    }

    public void start(){
        strategy.delivery();
    }
}
