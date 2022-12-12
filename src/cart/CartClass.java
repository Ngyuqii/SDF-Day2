package Cart;

import java.util.LinkedList;
import java.util.List;

public class CartClass {
    
    //Fields
    /*Can also include constant field eg.
    public static final String APPLE = "apple";
    public static final String ORANGE = "orange";
    */
    private List<Item> cart;

    //Constructor
    public CartClass() {
        this.cart = new LinkedList<Item>();
    }

    //Method to list items in shopping cart
    public void listContents() {
        if (cart.size() == 0) {
            System.out.println("Your cart is empty.");
        }
        else {
            System.out.println("Your cart has the following items.");
            for (Integer i = 0; i < cart.size(); i++) {
                Item item = cart.get(i);
                System.out.printf("%d: %s, %d pieces at $%.2f each\n", i + 1, item.getName(), item.getQuantity(), item.getPrice());
            }
        }
    }

    //Method to add items to cart
    public Boolean addToCart(String item, Integer quantity, Float price) {
        
        Item toAdd = null;

        switch (item) {
            
            case "apple":
            toAdd = new Apple();
            break;
            
            case "orange":
            toAdd = new Orange();
            break;

            default:
            return false;
        }

        toAdd.setQuantity(quantity);
        toAdd.setPrice(price);
        this.cart.add(toAdd);
        return true;
    }

    //Method to remove item from cart
    public Boolean removeFromCart(Integer index) {
        // Check if the index is in the list range
        if ((index < 0) || (index >= this.cart.size())) {
            return false;
        }
        else {
            this.cart.remove(index);
            return true;
        }
    }

    //Overload method to calculate price without discount
    public void calculate() {
        this.calculate(0f);
    }

    //Method to calculate for discounted item
    public void calculate(Float discount) {
        
        Float total = 0f;
   
        for (Item item: this.cart) {
            Float subtotal = item.getPrice() * item.getQuantity();
            System.out.printf("%s [Code %s] : %d at %.2f= $%.2f\n", 
                    item.getName(), item.getCode(), item.getQuantity(), item.getPrice(), subtotal);
            total += subtotal;
        }

        if (discount != 0) {
            System.out.printf("Applying a %2.2f%% discount to %f\n", discount, total);
            total -= (total * discount);
        }
        else {
            System.out.printf("Grand total: $%.2f\n", total);
        }
 
    }

}