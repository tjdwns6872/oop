package training.factoryStrategy_2;

public class DiscountProvider {

    public DiscountStrategy getDiscountStrategy(DiscountEnum type){
        DiscountStrategy discountStrategy;

        switch (type) {
            case Fix:
                discountStrategy = new FixDiscount();
                break;
            case ratio:
                discountStrategy = new RatioDiscount();
                break;
            default:
                throw new IllegalArgumentException("존재하지 않는 할인 정책입니다.");
        }
        System.out.println("["+type.getDiscountName()+"] 적용됨");
        return discountStrategy;
    }
    
}
