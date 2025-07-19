package newStudyFile.day_4;

public abstract class CharacterDecorator implements Character{

    protected Character character;

    public CharacterDecorator(Character character){
        this.character = character;
    }

    public String toString(){
        return "[캐릭터] " + getDescription() + "\n[공격력] " + getAttack();
    }
    
}
