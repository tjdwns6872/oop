package training.factoryStrategy_3;

public class LanguageFrFactory extends LanguageFactory{

    @Override
    public LanguageStrategy createStrategy() {
        return new LanguageFr();
    }
    
}
