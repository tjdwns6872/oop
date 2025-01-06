package training.factoryStrategy_2;

public class StandardDeliveryFactory extends DeliveryFactory{

    @Override
    public DeliveryStrategy createDeliveryFactory() {
        return new StandardDelivery();
    }
    
}
