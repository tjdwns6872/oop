package training.decorator_2;

public class SyrupDecorator extends CoffeeDecorator{

    public SyrupDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String order(){
        return super.order() + "+ Syrup";
    }

    @Override
    public double total(){
        return super.total() + 0.7;
    }
    
}
