package training.factoryStrategy_2;

public class NextDayDeliveryFactory extends DeliveryFactory{

    @Override
    public DeliveryStrategy createDeliveryFactory() {
        return new NextDayDeliver();
    }
    
}
