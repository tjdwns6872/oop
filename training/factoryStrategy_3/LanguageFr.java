package training.factoryStrategy_3;

public class LanguageFr implements LanguageStrategy{
    
    @Override
    public LanguageEnum getLangEnum() {
        return LanguageEnum.FR;
    }
}
