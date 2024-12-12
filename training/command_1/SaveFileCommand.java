package training.command_1;

public class SaveFileCommand implements Command {

    private Receiver receiver;
    
    public SaveFileCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void executeCommand() {
        receiver.executeCommand("File saved");
    }
    
}
