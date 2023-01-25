import java.util.Scanner;

public class Shopping{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String name;
        double cost;
        int amount;
        boolean end = false;
        String input;
        ShoppingCart cart = new ShoppingCart();

        System.out.println("WELCOME TO TARGET'S NEW TRUST SYSTEM SHOPPING EXPRESS EXPERIANCE");
        System.out.println();
        
        while(end == false){
            System.out.println();
            System.out.println("WHAT DO YOU WANT TO BUY");
            System.out.print("enter item name: ");
            name = scan.next();
            
            System.out.println();
            System.out.println("HOW MUCH DOES " + name + " COST");
            System.out.print("enter item cost: ");
            cost = scan.nextDouble();
            
            System.out.println();
            System.out.println("HOW MANY " + name + " DID YOU BUY");
            System.out.print("enter amount purchased: ");
            amount = scan.nextInt();
            
            if (cart.getItemCount() + 1 > cart.getCapacity()){
                if (cart.getCapacity() < 8){

                    System.out.println("CART AT CAPACITY");
                    System.out.println("WOULD YOU LIKE TO EXPAND YOUR CART?");
                    System.out.print("y/n: ");
                    input = scan.next();
                    
                    cart.biggerCart(input);
                    
                    if (cart.getItemCount() + 1 <= cart.getCapacity()){
                        cart.addToCart(name,cost,amount);
                    }
                }
                else{
                    System.out.println("PLEASE HEAD TO CHECK OUT");
                }
            }
            else{
                cart.addToCart(name,cost,amount);
            }


            System.out.println();
            System.out.println("HEAD TO CHECK OUT?");
            System.out.print("y/n: ");
            input = scan.next();

            if (input.equals("y") || input.equals("Y")){
                end = true;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("THANK YOU FOR SHOPPING WITH TARGET'S NEW TRUST SYSTEM SHOPPING EXPRESS EXPERIANCE");
        System.out.println("HAVE A DAY");
        System.out.println();
        System.out.println(cart.toString());
    }
}