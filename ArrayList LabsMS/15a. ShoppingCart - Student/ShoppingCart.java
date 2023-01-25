// ***************************************************************
// ShoppingCart.java
//
// Represents a shopping cart as an array of items
// ***************************************************************
import java.text.NumberFormat;
import java.util.Scanner;

public class ShoppingCart{
    Scanner scan = new Scanner(System.in);

    private int itemCount; // total number of items in the cart
    private double totalPrice; // total price of items in the cart
    private int capacity; // current cart capacity
    private Item[] cart;
    private Item[] temp;

    // ---------------------------------------------------------
    // Creates an empty shopping cart with a capacity of 5 items.
    // ---------------------------------------------------------
    public ShoppingCart(){
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new Item[capacity];
        temp = new Item[capacity];
    }
    
    // -----------------------------------------------------
    // Adds an item to the shopping cart.
    // -----------------------------------------------------
    public void addToCart(String itemName, double price, int quantity){
        itemCount += 1;
        totalPrice += price * quantity;
        cart[itemCount - 1] = new Item(itemName, price, quantity);
        
    }
    // -----------------------------------------------------
    // Returns the contents of the cart together with
    // summary information.
    // -----------------------------------------------------
    public int getCapacity(){
        return(capacity);
    }
    
    public int getItemCount(){
        return(itemCount);
    }

    public void biggerCart(String input){
        if (input.equals("y") || input.equals("Y")){
            for (int i = 0; i < cart.length; i++){
                temp[i] = cart[i];
            }
            
            capacity += 3;
            cart = new Item[capacity];
            
            for (int i = 0; i < temp.length; i++){
                cart[i] = temp[i];
            }
        }
        else{
            System.out.println("PLEASE HEAD TO CHECK OUT");
        }
    }
    
    public String toString(){
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String contents = "\nShopping Cart\n";
        contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";

        for (int i = 0; i < itemCount; i++){
            contents += cart[i].toString() + "\n";
        }

        contents += "\nTotal Price: " + fmt.format(totalPrice);
        contents += "\n";
        return contents;
    }
    // -----------------------------------------------------
    // Increases the capacity of the shopping cart by 3
    // -----------------------------------------------------
    private void increaseSize(String input){
        
    }
}