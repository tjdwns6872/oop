package newStudyFile.fiveDay;

public class BasicCoffee implements Coffee{

    @Override
    public String getDescription() {
        return "기본 커피";
    }

    @Override
    public int getCost() {
        return 3000;
    }


}
