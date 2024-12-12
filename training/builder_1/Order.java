package training.builder_1;

public class Order {

    private String productName;
    private String price;

    private Integer discount;
    private boolean packed;
    private Integer quantity;

    public Order(String productName, String price, Integer discount, boolean packed, Integer quantity){
        this.productName = productName;
        this.price = price;
        this.discount = discount;
        this.packed = packed;
        this.quantity = quantity;
    }
}
