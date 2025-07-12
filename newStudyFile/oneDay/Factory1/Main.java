package newStudyFile.oneDay.Factory1;

public class Main {
    public static void main(String[] args) {
        
        FoodFactory factory = new FoodFactory();
        Food pizza = factory.makeFood("Pizza");
        pizza.getFood();
    }
    
}
