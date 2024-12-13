package training.abstractFactory_1;

public class Helmet implements Armor{

    public Helmet() {
        System.out.println("Armor: Helmet created!");
    }

    @Override
    public void use() {
        System.out.println("Helmet is protecting your head!");
    }
    
}
