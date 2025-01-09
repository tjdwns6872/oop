package training.factoryStrategy_4;

public class MessageHelper {
    
    private static final MessageHelper instance = new MessageHelper();

    private MessageHelper(){};

    public static MessageHelper getInstance(){
        return instance;
    }

    public void printMessage(String context){
        System.out.println(context);
    }
}
