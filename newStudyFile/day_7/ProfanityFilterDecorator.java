package newStudyFile.day_7;

public class ProfanityFilterDecorator extends InputFilterDecorator{

    public ProfanityFilterDecorator(InputProcessor inputProcessor) {
        super(inputProcessor);
    }

    @Override
    public String process(String input) {
        String[] profanitys = {"멍청이", "바보"};
        String result = input;
        for(String profanity : profanitys){
            int len = profanity.length();
            String star = "*".repeat(len);
            result = result.replace(profanity, star);
        }
        return inputProcessor.process(result);
    }
    
}
