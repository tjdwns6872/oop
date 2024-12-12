package training.command_1;

public class OpenFileCommand implements Command{
    
    private Receiver receiver;

    public OpenFileCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void executeCommand() {
        receiver.executeCommand("File opened");
    }
}
