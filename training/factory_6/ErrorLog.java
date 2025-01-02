package training.factory_6;

public class ErrorLog implements LogLevel{

    private static final String LEVEL = "ERROR";

    @Override
    public void log(String message) {
        System.err.println(message);
    }
    
    @Override
    public void log(String message, FormatEnum type) {
        LogFormatHelper lfh = new LogFormatHelper();
        String formatString = lfh.logformat(message, type, LEVEL);
        System.err.println(formatString);
    }

    @Override
    public String getLogLevel() {
        return LEVEL;
    }
}
