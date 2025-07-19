package newStudyFile.day_6;

public class CompressionDecorator extends ConverterDecorator{

    public CompressionDecorator(DocumentConverter converter) {
        super(converter);
    }

    @Override
    public String convert(String input) {
        input = converter.convert(input);
        System.out.println("[Compression] 압축 됨");
        String subString = input.substring(0, 10);
        return subString;
    }
    
}
