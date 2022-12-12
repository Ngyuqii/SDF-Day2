package Cart;

public class Apple extends Item {
   
    private String type;

    //Constructor
    public Apple() {
        super("Apple", "Fuji Apple");
    }

    //Getter and Setter
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

}
