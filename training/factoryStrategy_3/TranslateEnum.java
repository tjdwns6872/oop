package training.factoryStrategy_3;

public enum TranslateEnum {
    Google("GoogleTranslate", "Google API를 사용한 번역")
    , Azure("AzureTranslate", "Azure API를 사용한 번역")
    , Manual("ManualTranslate", "수동 번역, 사람이 작성한 번역 데이터를 사용");

    private final String displayName;

    private final String explanation;

    TranslateEnum(String name, String explanation){
        this.displayName = name;
        this.explanation = explanation;
    }

    public String getName(){
        return this.displayName;
    }

    public String getExplanation(){
        return this.explanation;
    }
}
