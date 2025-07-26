package newStudyFile.day_11.model.message;

public class FooterDecorator extends MessageDecorator{

    public FooterDecorator(Message message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return message.getMessage()+"[FOOTER]";
    }
    
}
