package newStudyFile.twoDay;

public class DeliveryContext {
    private DeliveryStrategy strategy;
    public DeliveryContext(DeliveryStrategy strategy){
        this.strategy = strategy;
    }

    public void start(){
        strategy.delivery();
    }
}
