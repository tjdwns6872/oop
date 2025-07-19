package newStudyFile.day_6;

public class LoggingDecorator extends ConverterDecorator{
    
    public LoggingDecorator(DocumentConverter converter){
        super(converter);
    }

    public String convert(String input) {
        System.out.println("[Logging] 변환 시작: "+input);
        String result = converter.convert(input);
        System.out.println("[Logging] 변환 종료"+ result);
        return result;
    }
}
