package training.factoryStrategy_4;

public class RegularCustomer implements Customer{
    
    private CustomerStrategy strategy;
    private CustomerEnum type;

    RegularCustomer(){
        this.type = CustomerEnum.Regular;
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
