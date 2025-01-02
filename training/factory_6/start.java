package training.factory_6;

public class start {

    public static void main(String[] args) {
        // 로그 팩토리 객체 생성
        LogFactory adminLogFactory = new AdminLogFactory();
        LogFactory userLogFactory = new UserLogFactory();
        LogFactory guestLogFactory = new GuestLogFactory();
        
        // 로그 레벨 테스트
        System.out.println("==== Admin Log Test ====");
        testLog(adminLogFactory, LogLevelEnum.INFO);
        testLog(adminLogFactory, LogLevelEnum.WARN);
        testLog(adminLogFactory, LogLevelEnum.ERROR);
        testLog(adminLogFactory, LogLevelEnum.DEBUG);
        
        System.out.println("\n==== User Log Test ====");
        testLog(userLogFactory, LogLevelEnum.INFO);
        testLog(userLogFactory, LogLevelEnum.ERROR);  // ERROR only available in UserLogFactory
        
        System.out.println("\n==== Guest Log Test ====");
        testLog(guestLogFactory, LogLevelEnum.INFO);  // Only INFO available in GuestLogFactory

    }

    private static void testLog(LogFactory logFactory, LogLevelEnum level) {
        try {
            // 로그 객체 가져오기
            LogLevel log = logFactory.getLog(level);
            
            // 로그 출력
            System.out.println("Testing " + level + " level log:");
            log.log("This is a " + level + " message.");
            log.log("This is a " + level + " message with timestamp.", FormatEnum.Time);
            log.log("This is a " + level + " message with level.", FormatEnum.Level);
            log.log("This is a " + level + " message with all information.", FormatEnum.All);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}