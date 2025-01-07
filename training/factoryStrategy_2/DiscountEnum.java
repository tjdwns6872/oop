package training.factoryStrategy_2;

public enum DiscountEnum {
    Fix(10, "고정 할인"), ratio(20, "비율 할인");


    private final Integer discountData;
    private final String getDiscountName;

    DiscountEnum(Integer discountData, String getDiscountName){
        this.discountData = discountData;
        this.getDiscountName = getDiscountName;
    }

    public Integer getDiscountData(){
        return discountData;
    }

    public String getDiscountName(){
        return getDiscountName;
    }
}
