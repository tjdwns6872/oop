package newStudyFile.day_5;

public class Cinnamon extends CoffeeDecorator{

    public Cinnamon(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+"+시나몬 추가";
    }

    @Override
    public int getCost() {
        return coffee.getCost()+300;
    }
    
}
