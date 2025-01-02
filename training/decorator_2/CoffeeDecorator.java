package training.decorator_2;

public abstract class CoffeeDecorator implements Coffee{
    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String order(){
        return coffee.order();
    }

    @Override
    public double total(){
        return coffee.total();
    }
}
