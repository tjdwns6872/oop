package training.factoryStrategy_2;

public class InternationalDeliveryFactory extends DeliveryFactory{

    @Override
    public DeliveryStrategy createDeliveryFactory() {
        return new InternationalDelivery();
    }
    
}
