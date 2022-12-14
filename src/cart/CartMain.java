package Cart;

import java.io.Console;

public class CartMain {

    //Declare constant fields
    public static final String CHECKOUT = "Checkout";
    public static final String ADD = "Add";
    public static final String REMOVE = "Remove";
    public static final String LIST = "List";

    public static void main(String[] args) {
     
        Console cons = System.console();
        Boolean stop = false;

        //Create an instance of CartClass
        CartClass shoppingCart = new CartClass();
        System.out.println("Welcome to your shopping cart.");
        System.out.println("Add / Remove / List / Checkout");

        while (!stop) {
            String line = cons.readLine("Please input your command. >");
            String[] terms = line.trim().split(" ");

            switch (terms[0]) {

                case ADD:
                    String item = terms[1];
                    Integer quantity = Integer.parseInt(terms[2]);
                    Float price = Float.parseFloat(terms[3]);

                    //Boolean addToCart is true
                    if (shoppingCart.addToCart(item, quantity, price)) {
                        System.out.printf("%s added to your shopping cart\n", item);
                    }
                    else {
                        System.err.printf("%s is not in our inventory.\n", item);
                    }
                    break;

                case REMOVE:
                    Integer index = Integer.parseInt(terms[1]);

                    //Boolean removeFromCart is true
                    if (shoppingCart.removeFromCart(index)) {
                        System.out.println("Item removed from shopping cart.");
                    }
                    else {
                        System.err.println("Cannot find item in the shopping cart.");
                    }
                    break;

                case LIST:
                    shoppingCart.listContents();
                    break;

                case CHECKOUT:
                    // Check if discount is applied
                    if (terms.length > 1) {
                        Integer discount = Integer.parseInt(terms[1]);
                        shoppingCart.calculate(discount);
                    }
                    else {
                        shoppingCart.calculate();
                    }
                    stop = true;
                    break;

                default:
                    System.out.printf("Unknown command: %s.\n", terms[0]);
            }

        }

        System.out.println("Thank you, have a nice day.");
    
    }

}