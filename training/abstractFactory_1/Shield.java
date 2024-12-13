package training.abstractFactory_1;

public class Shield implements Armor{

    public Shield() {
        System.out.println("Armor: Shield created!");
    }

    @Override
    public void use() {
        System.out.println("Sword is slashing!");
    }
    
}
