package training.command_1;

public class CloseFileCommand implements Command{

    private Receiver receiver;

    public CloseFileCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void executeCommand() {
        receiver.executeCommand("File closed");
    }
}
