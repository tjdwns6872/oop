package newStudyFile.day_9.model.discount;

public interface DiscountStrategy {
    public String getDiscount();
    public int applyDiscount(int totalPrice);
}
