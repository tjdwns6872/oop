package training.factory_5;

public class InfoLog implements LogLevel{

    @Override
    public void log(String message) {
        System.out.println(message);
    }
    
}
