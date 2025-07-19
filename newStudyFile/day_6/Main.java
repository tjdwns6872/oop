package newStudyFile.day_6;

public class Main {
    public static void main(String[] args) {
        String input = "Hello, world!";
        DocumentConverter converter = ConverterFactory.getConverter("PDF");
        converter = new LoggingDecorator(converter);
        converter = new EncryptionDecorator(converter);
        converter = new CompressionDecorator(converter);
        converter = new WatermarkDecorator(converter);
        converter.convert(input);
    }
}
