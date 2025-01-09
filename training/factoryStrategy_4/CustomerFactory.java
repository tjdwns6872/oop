package training.factoryStrategy_4;

public abstract class CustomerFactory {

    private CustomerEnum type;

    CustomerFactory(CustomerEnum type){
        this.type = type;
    }
    
    public abstract Customer createCustomer();

}