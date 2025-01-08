package training.factoryStrategy_3;

public class AzureFactory extends TranslateFactory{

    @Override
    public TranslateStrategy createStrategy() {
        return new AzureTranslate();
    }
    
}
