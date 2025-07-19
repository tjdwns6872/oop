package newStudyFile.day_6;

public class HtmlConverter implements DocumentConverter{

    @Override
    public String convert(String input) {
        return "[HTML]"+input;
    }
    
}
