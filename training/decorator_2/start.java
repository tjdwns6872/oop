package training.decorator_2;

public class start {
    public static void main(String[] args) {
        Coffee espresso = new CoffeeType("Espresso");
        espresso = new MilkDecorator(espresso); // 우유 추가

        System.out.println("Order: " + espresso.order());
        System.out.println("Total: " + espresso.total()+" USD");
    }
}
