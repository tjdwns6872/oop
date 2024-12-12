package training.command_2;

public class start {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Tv tv = new Tv();
        Radio radio = new Radio();

        Command tvOn = new PowerOnCommand(tv);
        Command tvOff = new PowerOffCommand(tv);

        Command radioOn = new PowerOnCommand(radio);
        Command radioOff = new PowerOffCommand(radio);

        // TV 제어
        remote.setCommand(tvOn);
        remote.pressButton(); // Output: TV is now ON.

        remote.setCommand(tvOff);
        remote.pressButton(); // Output: TV is now OFF.

        // 라디오 제어
        remote.setCommand(radioOn);
        remote.pressButton(); // Output: Radio is now ON.

        remote.setCommand(radioOff);
        remote.pressButton(); // Output: Radio is now OFF.
    }

}
