package training.factoryStrategy_4;

public class CustomerProvider {
    
    public static CustomerFactory getFactory(CustomerEnum type){
        CustomerFactory factory = null;

        switch (type) {
            case Regular:
                factory = new RegularFactory();
                break;
            case VIP:
                factory = new VipFactory();
                break;
            default:
                throw new IllegalArgumentException("존재하지 않는 고객유형입니다.");
        }
        return factory;
    }

    public static CustomerStrategy getStrategy(CustomerEnum type){
        CustomerStrategy strategy = null;

        switch (type) {
            case Regular:
                strategy = new RegularStrategy();
                break;
            case VIP:
                strategy = new VipStrategy();
                break;
            default:
                throw new IllegalArgumentException("존재하지 않는 고객유형입니다.");
        }
        return strategy;
    }
}
