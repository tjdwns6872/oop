package newStudyFile.day_7;

public abstract class InputFilterDecorator implements InputProcessor{
    protected InputProcessor inputProcessor;    

    public InputFilterDecorator(InputProcessor inputProcessor){
        this.inputProcessor = inputProcessor;
    }
}
