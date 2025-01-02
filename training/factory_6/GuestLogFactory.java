package training.factory_6;

public class GuestLogFactory extends LogFactory{
    
    @Override
    public LogLevel getLog(LogLevelEnum type){
        switch (type) {
            case INFO:
                return new InfoLog();
            default:
                throw new IllegalArgumentException("잘못된 로그 레벨입니다.");
        }
    };
}
