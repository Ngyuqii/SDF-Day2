package Cart;

public class CartSample {

    public static void main(String[] args) {

        Item apple = new Apple();
        Item orange = new Orange();
    
        apple.setPrice(0.5f);
        apple.setQuantity(10);
        System.out.println(apple.getCode());
        System.out.printf("The total cost of %s is $ %.2f.\n", apple.getName(), apple.totalPrice());

        orange.setPrice(0.6f);
        orange.setQuantity(5);
        System.out.println(orange.getCode());
        System.out.printf("The total cost of %s is $ %.2f.\n", orange.getName(), orange.totalPrice());
    
    }

}
