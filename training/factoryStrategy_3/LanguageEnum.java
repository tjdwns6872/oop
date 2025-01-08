package training.factoryStrategy_3;

public enum LanguageEnum {
    EN("영어")
    , ES("스페인어")
    , KR("한국어")
    , FR("프랑스어");

    private final String displayName;


    LanguageEnum(String name){
        this.displayName = name;
    }

    public String getName(){
        return this.displayName;
    }

}
