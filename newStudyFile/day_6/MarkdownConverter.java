package newStudyFile.day_6;

public class MarkdownConverter implements DocumentConverter{

    @Override
    public String convert(String input) {
        return "[Markdown]"+input;
    }
    
}
