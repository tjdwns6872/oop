package newStudyFile.day_7;

public class Main {
    public static void main(String[] args) {
        String userInput = "   <b>안녕</b> 멍청이 바보  ";
        InputProcessor processor = new TrimFilterDecorator(
            new HtmlFilterDecorator(
                new ProfanityFilterDecorator(
                    new BasicInputProcessor()
                )
            )
        );

        String input = processor.process(userInput);
        System.out.println(input);
    }
}
