package training.templateMethod_1;

public class FileDataProcessor extends DataProcessor{

    @Override
    public void readData() {
        System.out.println("Reading data from file...");
    }

    @Override
    public void processData() {
        System.out.println("Processing file data...");
    }

    @Override
    public void outputData() {
        System.out.println("Outputting processed file data...");
    }
    
}
