package training.abstractFactory_1;

public class start {
    public static void main(String[] args) {
        ItemFactory medievalFactory = new MedievalItemFactory();
        Weapon sword = medievalFactory.createWeapon();
        Armor shield = medievalFactory.createArmor();
    
        sword.use();
        shield.use();
    
        ItemFactory futuristicFactory = new FuturisticItemFactory();
        Weapon bow = futuristicFactory.createWeapon();
        Armor helmet = futuristicFactory.createArmor();
    
        bow.use();
        helmet.use();
    }
}
