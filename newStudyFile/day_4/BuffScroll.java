package newStudyFile.day_4;

public class BuffScroll extends CharacterDecorator{

    public BuffScroll(Character character) {
        super(character);
    }

    @Override
    public String getDescription() {
        return character.getDescription()+" + 버프스크롤";
    }

    @Override
    public Integer getAttack() {
        return character.getAttack()+7;
    }
    
}
