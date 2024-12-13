package training.abstractFactory_1;

public class Bow implements Weapon{

    public Bow() {
        System.out.println("Weapon: Bow created!");
    }

    @Override
    public void use() {
        System.out.println("Bow is shooting lasers!");
    }
    
}
