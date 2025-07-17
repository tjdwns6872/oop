package newStudyFile.fiveDay;

public class CoffeeFactory {
    
    public Coffee createCoffee(String ingredient, Coffee coffee){
        switch (ingredient) {
            case "Milk":
                return new Milk(coffee);
            case "Vanilla":
                return new Vanilla(coffee);
            case "Cinnamon":
                return new Cinnamon(coffee);
            case "Decaffeinated":
                return new Decaffeinated(coffee);
            case "WhippedCream":
                return new WhippedCream(coffee);
            case "stop":
                return coffee;
            default:
                throw new IllegalArgumentException("존재 하지 않는 재료입니다");
        }
    }
}
