package training.factory_6;

public abstract class LogFactory {
    
    public LogFactory(){};

    public abstract LogLevel getLog(LogLevelEnum type);
}
