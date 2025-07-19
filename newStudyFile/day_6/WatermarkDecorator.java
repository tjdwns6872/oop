package newStudyFile.day_6;

public class WatermarkDecorator extends ConverterDecorator{

    public WatermarkDecorator(DocumentConverter converter) {
        super(converter);
    }

    @Override
    public String convert(String input) {
        input = converter.convert(input);
        String water = input+"\n--워터마크!!--";
        System.out.println("[Watermark]워터마크 적용 됨");
        return water;
    }
    
}
