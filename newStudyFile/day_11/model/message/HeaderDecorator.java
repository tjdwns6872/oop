package newStudyFile.day_11.model.message;

public class HeaderDecorator extends MessageDecorator{

    public HeaderDecorator(Message message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "[HEADER]"+message.getMessage();
    }
    
}
