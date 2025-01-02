package training.decorator_2;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }
    
    @Override
    public String order(){
        return super.order() + "+ Milk";
    }

    @Override
    public double total(){
        return super.total() + 0.5;
    }
}
