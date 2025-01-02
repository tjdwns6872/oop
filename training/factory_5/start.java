package training.factory_5;

public class start {
    public static void main(String[] args) {
        LogFactory logF = new LogFactory("INFO");
        LogLevel log = logF.getLog();

        log.log("성공");
    }
}
