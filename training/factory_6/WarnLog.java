package training.factory_6;

public class WarnLog implements LogLevel{

    private static final String LEVEL = "WARN";

    @Override
    public void log(String message) {
        System.out.println(message);
    }
    
    @Override
    public void log(String message, FormatEnum type) {
        LogFormatHelper lfh = new LogFormatHelper();
        String formatString = lfh.logformat(message, type, LEVEL);
        System.out.println(formatString);
    }

    @Override
    public String getLogLevel() {
        return LEVEL;
    }
}
