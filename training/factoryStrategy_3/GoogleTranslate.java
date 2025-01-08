package training.factoryStrategy_3;

public class GoogleTranslate implements TranslateStrategy{

    @Override
    public TranslateEnum getEnum() {
        return TranslateEnum.Google;
    }
    
    @Override
    public String execute(String context, LanguageStrategy langType) {
        return context + " 번역 결과: " + langType.getLangEnum().getName();
    }
}
