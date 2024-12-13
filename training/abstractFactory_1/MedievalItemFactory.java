package training.abstractFactory_1;

public class MedievalItemFactory implements ItemFactory{

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public Armor createArmor() {
        return new Shield();
    }
    
}
