package newStudyFile.day_5;

public class Milk extends CoffeeDecorator{

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + "+우유 추가";
    }

    @Override
    public int getCost() {
        return coffee.getCost()+500;
    }
    
}
