package newStudyFile.day_6;

public class PdfConverter implements DocumentConverter{

    @Override
    public String convert(String input) {
        return "[PDF]"+input;
    }
    
}
