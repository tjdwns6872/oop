package training.factoryStrategy_4;

public class VipCustomer implements Customer{

    private CustomerStrategy strategy;
    private CustomerEnum type;

    VipCustomer(){
        this.type = CustomerEnum.VIP;
        this.strategy = CustomerProvider.getStrategy(this.type);
    }

    @Override
    public CustomerStrategy getStrategy(){
        return this.strategy;
    }

    @Override
    public CustomerEnum getEnum(){
        return this.type;
    }
    
}
