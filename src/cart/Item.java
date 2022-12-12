package Cart;

public class Item {
    
    //Fields
    private String name = "";
    private String code = "";
    private Float price = 0f;
    private Integer quantity = 0;

    //Constuctor
    public Item(String itemName, String itemCode) {
        this.name = itemName;
        this.code = itemCode;
    }

    //Method to get total price
    public Float totalPrice() {
        return this.price * this.quantity;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    
    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
