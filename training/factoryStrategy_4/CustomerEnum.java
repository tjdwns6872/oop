package training.factoryStrategy_4;

public enum CustomerEnum {
    Regular("일반 고객", 5), VIP("VIP 고객", 20);

    private final String name;
    private final Integer percent;

    CustomerEnum(String name, Integer percent){
        this.name = name;
        this.percent = percent;
    }

    public String getName(){
        return this.name;
    }

    public Integer getPercent(){
        return this.percent;
    }
}