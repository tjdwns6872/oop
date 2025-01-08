package training.factoryStrategy_3;

public class AzureTranslate implements TranslateStrategy{

    @Override
    public TranslateEnum getEnum() {
        return TranslateEnum.Azure;
    }

    @Override
    public String execute(String context, LanguageStrategy langType) {
        return context + " 번역 결과: " + langType.getLangEnum().getName();
    }

}
