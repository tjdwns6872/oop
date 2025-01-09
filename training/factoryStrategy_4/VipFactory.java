package training.factoryStrategy_4;

public class VipFactory extends CustomerFactory{

    VipFactory(){
        super(CustomerEnum.VIP);
    }

    @Override
    public Customer createCustomer() {
        return new VipCustomer();
    }
    
}
