package training.factory_6;

public interface LogLevel {
    
    public void log(String message);

    public void log(String message, FormatEnum type);

    public String getLogLevel();
}
