package training.factoryStrategy_3;

public class GoogleFactory extends TranslateFactory{

    @Override
    public TranslateStrategy createStrategy() {
        return new GoogleTranslate();
    }
    
}
