import java.util.Scanner;
import java.text.NumberFormat;

public class WalletManager{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance(); // new number format as 0.00
        
        int input = 0;

        DigiWallet digiW1 = new DigiWallet();
        
        System.out.println("Welcome to DigiWalletTM!");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Let's get you started with an account!");
        System.out.println();
        System.out.println("First, what's your name?");

        digiW1.setName();

        System.out.println();
        System.out.println("Nice to meet you!");
        System.out.println();
        System.out.println("What is your date of birth?");

        digiW1.setBirthDate();

        System.out.println();
        System.out.println();

        digiW1.setPocket(10);
        digiW1.setCard1(10);
        digiW1.setCard2(10);
        digiW1.setCard3(10);

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("That's it! Thank you joining us!");
        System.out.println("Take a complementary $40.00");
        System.out.println("\n\n\n");

        digiW1.setID(000001);
        digiW1.setBalance();

        digiW1.home();
    }
}