package training.factoryStrategy_2;

public class ExpressDeliveryFactory extends DeliveryFactory{

    @Override
    public DeliveryStrategy createDeliveryFactory() {
        return new ExpressDelivery();
    }
    
}
