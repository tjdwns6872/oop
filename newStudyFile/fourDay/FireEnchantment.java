package newStudyFile.fourDay;

public class FireEnchantment extends CharacterDecorator{

    public FireEnchantment(Character character) {
        super(character);
    }

    @Override
    public String getDescription() {
        return character.getDescription() + " + 불속성";
    }

    @Override
    public Integer getAttack() {
        return character.getAttack()+5;
    }
    
}
