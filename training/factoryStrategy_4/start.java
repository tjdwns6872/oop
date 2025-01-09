package training.factoryStrategy_4;

public class start {
    public static void main(String[] args) {
        
        OrderProcessor orderProcessor = new OrderProcessor(CustomerEnum.Regular);
        orderProcessor.order(100);
    }
}
