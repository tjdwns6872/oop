package training.factoryStrategy_2;

public class ExpressDelivery implements DeliveryStrategy{

    @Override
    public Integer getCharge() {
        return getType().getCharge();
    }

    @Override
    public DeliveryEnum getType() {
        return DeliveryEnum.Express;
    }
    
}