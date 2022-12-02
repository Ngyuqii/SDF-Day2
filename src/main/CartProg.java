package main;
import cart.Item;
import cart.Apple;
import cart.Orange;

public class CartProg {
    public static void main(String[] args) {
        Item apple = new Item("apple", "Apple");
        Item orange = new Item ("orange", "Orange");
    
        apple.setPrice(0.5f);
        apple.setQuantity(10);
        System.out.println(apple.getName());
        System.out.println(apple.gettotalPrice());

        orange.setPrice(0.6f);
        orange.setQuantity(5);
        System.out.println(orange.getName());
    
    }
}
