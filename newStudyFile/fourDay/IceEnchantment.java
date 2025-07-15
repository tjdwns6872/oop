package newStudyFile.fourDay;

public class IceEnchantment extends CharacterDecorator{

    public IceEnchantment(Character character){
        super(character);
    }

    @Override
    public String getDescription() {
        return character.getDescription() + " + 얼음속성";
    }

    @Override
    public Integer getAttack() {
        return character.getAttack()+3;
    }
    
}
