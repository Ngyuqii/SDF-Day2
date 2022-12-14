package Cart;

import java.util.LinkedList;
import java.util.List;

public class CartClass {
    
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
                System.out.printf("%d: %s, %d pc at $%.2f each\n", i + 1, item.getName(), item.getQuantity(), item.getPrice());
            }
        }
    }

    //Method to add items to cart
    public Boolean addToCart(String item, Integer quantity, Float price) {
        Item addItem;

        switch (item) {
            case "apple":
            addItem = new Apple(); //if user input "apple", create an instance of item apple
            break;
            
            case "orange":
            addItem = new Orange(); //if user input "apple", create an instance of item apple
            break;

            default:
            return false;
        }

        addItem.setQuantity(quantity);
        addItem.setPrice(price);
        this.cart.add(addItem); //adding the instance of Apple or Orange
        return true;
    }

    //Method to remove item from cart
    public Boolean removeFromCart(Integer index) {
        // Check if the index is in the list range
        if ((index <= 0) || (index > this.cart.size())) {
            return false;
        }
        else {
            this.cart.remove((int)index - 1);
            return true;
        }
    }

    //Overload method to calculate price without discount
    public void calculate() {
        this.calculate(0);
    }

    //Method to calculate for discounted item
    public void calculate(Integer discount) {
        Float total = 0f;
   
        for (Item item: this.cart) {
            //Float totalPrice() = this.price * this.quantity; from Item class
            System.out.printf("%s [%s] : %d pc at $%.2f = $%.2f\n", 
                    item.getName(), item.getCode(), item.getQuantity(), item.getPrice(), item.totalPrice());
            total += item.totalPrice();
        }

        if (discount != 0) {
            System.out.printf("Discount of %d%% on subtotal $%.2f.\n", discount, total);
            total -= (total * discount / 100) ;
            System.out.printf("Total: $%.2f\n", total);
        }
        else {
            System.out.printf("Total: $%.2f\n", total);
        }
    }

}