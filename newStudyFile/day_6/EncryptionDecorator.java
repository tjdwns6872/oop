package newStudyFile.day_6;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncryptionDecorator extends ConverterDecorator{

    public EncryptionDecorator(DocumentConverter converter){
        super(converter);
    }

    @Override
    public String convert(String input) {
        input = converter.convert(input);
        byte[] tempByte = input.getBytes(StandardCharsets.UTF_8);
        String base64Encoded = Base64.getEncoder().encodeToString(tempByte);
        System.out.println("[Encryption] 암호화 적용됨");
        return base64Encoded;
    }
    
}
