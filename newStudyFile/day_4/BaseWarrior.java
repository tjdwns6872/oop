package newStudyFile.day_4;

public class BaseWarrior implements Character{

    @Override
    public String getDescription() {
        return "기본 전사";
    }

    @Override
    public Integer getAttack() {
        return 10;
    }
    
}
