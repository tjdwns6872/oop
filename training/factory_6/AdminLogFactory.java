package training.factory_6;

public class AdminLogFactory extends LogFactory{
    
    @Override
    public LogLevel getLog(LogLevelEnum type){
        switch (type) {
            case INFO:
                return new InfoLog();
            case WARN:
                return new WarnLog();
            case ERROR:
                return new ErrorLog();
            case DEBUG:
                return new DebugLog();
            default:
                throw new IllegalArgumentException("잘못된 로그 레벨입니다.");
        }
    };
}
