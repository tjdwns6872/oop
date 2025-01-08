package training.factoryStrategy_3;

public class ManualFactory extends TranslateFactory{

    @Override
    public TranslateStrategy createStrategy() {
        return new ManualTranslate();
    }
    
}
