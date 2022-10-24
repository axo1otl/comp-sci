import java.util.Scanner;

public class Age{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scan.nextInt();
        
        // go ->
        if (age >= 16){
            System.out.println("Learn how to drive");
            if (age >= 17){
                if (age == 17){
                    System.out.println("Get into R rated movies");
                }
                else{
                    System.out.println("Get into R rated movies");
                    System.out.println("Purchase lottery ticket");
                    if (age >= 20){
                        System.out.println("Purchase alcohol");
                        if (age >= 20){
                            System.out.println("Rent a car");
                        }
                    }
                }
            }
        }
        else{
            System.out.println("No rights");
        }
    }
}