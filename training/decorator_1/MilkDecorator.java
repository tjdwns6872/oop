package training.decorator_1;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }
    
    @Override
    public double getCost() {
        return super.getCost() + 1.5; // 우유 가격 추가
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk"; // 설명 추가
    }
}
