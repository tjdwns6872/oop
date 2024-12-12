package training.command_1;

public class start {
    public static void main(String[] args) {
        
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();

        Command openCommand = new OpenFileCommand(receiver);
        Command saveCommand = new SaveFileCommand(receiver);
        Command closeCommand = new CloseFileCommand(receiver);

        invoker.setCommand(openCommand);
        invoker.executeCommand(); // Output: File opened

        invoker.setCommand(saveCommand);
        invoker.executeCommand(); // Output: File saved

        invoker.setCommand(closeCommand);
        invoker.executeCommand(); // Output: File closed
    }   
}
