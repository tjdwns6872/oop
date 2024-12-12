package training.builder_1;

public class OrderBuilder {
    
    private String productName;
    private String price;

    private Integer discount = 0;
    private boolean packed = false;
    private Integer quantity = 1;

    public OrderBuilder productName(String productName){
        this.productName = productName;
        return this;
    }

    public OrderBuilder price(String price){
        this.price = price;
        return this;
    }

    public OrderBuilder discount(Integer discount){
        this.discount = discount;
        return this;
    }

    public OrderBuilder packed(boolean packed){
        this.packed = packed;
        return this;
    }

    public OrderBuilder quantity(Integer quantity){
        this.quantity = quantity;
        return this;
    }

    public Order build(){
        if (productName == null || productName.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null or empty");
        }
        if (price == null || price.isEmpty()) {
            throw new IllegalArgumentException("Price cannot be null or empty");
        }
        return new Order(productName, price, discount, packed, quantity);
    }
}
