package newStudyFile.fiveDay;

public class Decaffeinated extends CoffeeDecorator{

    public Decaffeinated(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+"+디카페인 추가";
    }

    @Override
    public int getCost() {
        return coffee.getCost()+500;
    }
    
}
