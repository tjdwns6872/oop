package newStudyFile.day_5;

public class Vanilla extends CoffeeDecorator{

    public Vanilla(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+"+바닐라 시럽 추가";
    }

    @Override
    public int getCost() {
        return coffee.getCost()+700;
    }
    
}
