package training.factoryStrategy_4;

public class RegularFactory extends CustomerFactory{

    RegularFactory(){
        super(CustomerEnum.Regular);
    }

    @Override
    public Customer createCustomer() {
        return new RegularCustomer();
    }
    
}
