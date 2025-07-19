package newStudyFile.day_5;

public class WhippedCream extends CoffeeDecorator{

    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+"+휘핑크림 추가";
    }

    @Override
    public int getCost() {
        return coffee.getCost()+1000;
    }
    
}
