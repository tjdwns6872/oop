package training.singleton_1;

public class Logger {
    
    // private Logger instance;
    private static Logger instance;

    private Logger(){};

    // public Logger getInstance(String message){
    //     if(instance == null){
    //         this.instance = new Logger();
    //     }
    //     return instance;
    // }

    public static synchronized Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message){
        System.out.println(message);
    }

    public static void main(String[] args){
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("첫 번째 로그 메시지");
        logger2.log("두 번째 로그 메시지");

        // 두 객체의 참조가 동일한지 확인
        System.out.println("logger1과 logger2가 동일한 객체인가? " + (logger1 == logger2));
    }
}
