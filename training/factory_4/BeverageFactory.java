package training.factory_4;

public class BeverageFactory {
    
    public BeverageFactory(){}

    public Beverage getBeverage(String name){
        switch (name) {
            case "Coffee":
                return new Coffee();
            case "Tea":
                return new Tea();
            case "Juice":
                return new Juice();
            default:
                throw new IllegalArgumentException("잘못된 음료 주문입니다.");
        }
    }
}
