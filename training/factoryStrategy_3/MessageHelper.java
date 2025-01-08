package training.factoryStrategy_3;

public class MessageHelper {
    
    private static final MessageHelper instance = new MessageHelper();

    private MessageHelper(){};

    public static MessageHelper getInstance(){
        return instance;
    }

    public void printMassage(String title, String context){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(title);
        sb.append("] ");
        sb.append(context);
        System.out.println(sb.toString());
    }

    public void printMassage(String context){
        StringBuilder sb = new StringBuilder();
        sb.append(context);
        System.out.println(sb.toString());
    }
}
