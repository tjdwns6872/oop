package training.factoryStrategy_4;

public class OrderProcessor {

    private CustomerEnum type;

    OrderProcessor(CustomerEnum type){
        this.type = type;
    }
    
    public void order(Integer price){
        CustomerFactory factory = CustomerProvider.getFactory(type);
        Customer customer = factory.createCustomer();
        CustomerStrategy strategy = customer.getStrategy();

        double totalPrice = total(strategy, price);

        StringBuilder sb = new StringBuilder();
        sb.append(this.type.getName());
        sb.append(", ");
        sb.append(price);
        sb.append(" -> ");
        sb.append(totalPrice);
        MessageHelper.getInstance().printMessage(sb.toString());
    }

    public double total(CustomerStrategy strategy, Integer price){
        double totalPrice = strategy.discountPolicy(type.getPercent(), price);
        return totalPrice;
    }
}
