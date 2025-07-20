package newStudyFile.day_7;

public class TrimFilterDecorator extends InputFilterDecorator{

    public TrimFilterDecorator(InputProcessor inputProcessor) {
        super(inputProcessor);
    }

    @Override
    public String process(String input) {
        String result = inputProcessor.process(input.replaceAll(" ", ""));
        return result;
    }
    
}
