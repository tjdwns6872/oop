package training.factory_5;

public class LogFactory {

    private String type;

    public LogFactory(String type){
        this.type = type;
    };

    public LogLevel getLog(){
        switch (this.type) {
            case "INFO":
                return new InfoLog();
            case "WARN":
                return new WarnLog();
            case "ERROR":
                return new ErrorLog();
            default:
                throw new IllegalArgumentException("잘못된 로그 레벨입니다.");
        }
    }
    
}
