package training.templateMethod_1;

public class APIDataProcessor extends DataProcessor{

    @Override
    public void readData() {
        System.out.println("Reading data from API...");
    }

    @Override
    public void processData() {
        System.out.println("Processing API data...");
    }

    @Override
    public void outputData() {
        System.out.println("Outputting processed API data...");
    }
    
}
