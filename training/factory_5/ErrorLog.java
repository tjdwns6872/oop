package training.factory_5;

public class ErrorLog implements LogLevel{

    @Override
    public void log(String message) {
        System.err.println(message);
    }
    
}
