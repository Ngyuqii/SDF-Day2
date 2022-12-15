package cart;

public class Orange extends Item {
   
    private String type;
    
    //Constructor
    public Orange() {
        super("Orange", "Navel Orange");
    }

    //Getter and Setter
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

}