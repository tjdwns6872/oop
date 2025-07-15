package newStudyFile.fourDay;

public class Main {
    public static void main(String[] args) {
        Character character = new BaseWarrior();
        character = new FireEnchantment(character);
        character = new BuffScroll(character);

        System.out.println(character);
    }
}
