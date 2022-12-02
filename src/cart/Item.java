package cart;

public class Item {
    
//members
private String code;
private String name;
private Float price = 0f;
private Integer quantity = 0;

// constuctor
public Item(String newName, String newCode){
    this.name = newName;
    this.code = newCode;
}

//getter and setter
public String getCode() {return code;}
public void setCode(String code) {
    this.code = code;
}

public String getName() {return name;}
public void setName(String name) {
    this.name = name;
}

public Float getPrice() {return price;}
public void setPrice(Float price) {
    this.price = price;
}

public Integer getQuantity() {return quantity;}
public void setQuantity(Integer quantity) {
    this.quantity = quantity;
}

public Float totalPrice() {
    return this.price * this.quantity;
}

}
