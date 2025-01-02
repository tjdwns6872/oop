package training.factory_4;

public class start {
    public static void main(String[] args) {
        
        BeverageFactory beF = new BeverageFactory();
        Beverage coffee = beF.getBeverage("Juice");

        System.out.println(coffee.getName());
    }
}
