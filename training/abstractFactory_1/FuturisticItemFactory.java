package training.abstractFactory_1;

public class FuturisticItemFactory implements ItemFactory{

    @Override
    public Weapon createWeapon() {
        return new Bow();
    }

    @Override
    public Armor createArmor() {
        return new Helmet();
    }

    
}