package newStudyFile.day_7;

public class HtmlFilterDecorator extends InputFilterDecorator{

    public HtmlFilterDecorator(InputProcessor inputProcessor) {
        super(inputProcessor);
    }

    @Override
    public String process(String input) {
        String result = inputProcessor.process(input.replaceAll("<[^>]+>", ""));
        return result;
    }
    
}
