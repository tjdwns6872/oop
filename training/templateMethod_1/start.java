package training.templateMethod_1;

public class start {
    public static void main(String[] args) {
        DataProcessor file = new FileDataProcessor();
        DataProcessor api = new APIDataProcessor();
        file.execute();
        api.execute();
    }   
}
