package training.decorator_1;

public abstract class CoffeeDecorator implements Coffee{

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost(); // 기존 커피 가격 반환
    }

    @Override
    public String getDescription() {
        return coffee.getDescription(); // 기존 커피 설명 반환
    }
    
}
