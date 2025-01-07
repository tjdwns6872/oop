package training.factoryStrategy_2;

public enum DeliveryEnum {
    Standard(5, "일반"), Express(10, "빠른"), International(20, "국제"), NextDay(15, "익일");

    private final Integer charge;
    private final String name;

    DeliveryEnum(Integer charge, String name){
        this.charge = charge;
        this.name = name;
    }

    public Integer getCharge(){
        return charge;
    }

    public String getName(){
        return name;
    }
}
