package training.templateMethod_1;

public abstract class DataProcessor {
    
    public abstract void readData();

    public abstract void processData();

    public abstract void outputData();

    public void execute(){
        readData();
        processData();
        outputData();
    }
}
