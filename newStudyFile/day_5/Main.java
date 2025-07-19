package newStudyFile.day_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        CoffeeFactory factory = new CoffeeFactory();
        
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (!str.equals("stop")) {
            str = sc.next();
            coffee = factory.createCoffee(str, coffee);
        }
        sc.close();

        System.out.println(coffee);
    }
}
