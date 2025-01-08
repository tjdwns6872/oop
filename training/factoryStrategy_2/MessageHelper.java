package training.factoryStrategy_2;

public class MessageHelper {
    
    private static final MessageHelper instance = new MessageHelper();

    private MessageHelper(){};

    public static MessageHelper getInstance(){
        if(instance == null){
            return new MessageHelper();
        }
        return instance;
    }

    public void printMessage(String title, String context){
        StringBuilder sb = new StringBuilder();
        sb.append("["+title+"] ");
        sb.append(context);
        System.out.println(sb.toString());
    }

    public void printMessage(String context){
        StringBuilder sb = new StringBuilder();
        sb.append(context);
        System.out.println(sb.toString());
    }
}
