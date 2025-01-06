package training.factoryStrategy_2;

public enum DeliveryEnum {
    Standard(5), Express(10), International(20);

    private final Integer charge;

    DeliveryEnum(Integer charge){
        this.charge = charge;
    }

    public Integer getCharge(){
        return charge;
    }
}
