package Cart;

public class CartSample {

    public static void main(String[] args) {

        Item apple = new Apple();
        Item orange = new Orange();
    
        apple.setPrice(0.5f);
        apple.setQuantity(10);
        System.out.println(apple.getName());
        System.out.printf("The total cost of %s is $ %.2f.\n", apple.getCode(), apple.totalPrice());

        orange.setPrice(0.6f);
        orange.setQuantity(5);
        System.out.println(orange.getName());
        System.out.printf("The total cost of %s is $ %.2f.\n", orange.getCode(), orange.totalPrice());
    
    }

}
