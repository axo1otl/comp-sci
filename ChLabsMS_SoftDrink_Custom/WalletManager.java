import java.util.Scanner;
import java.text.NumberFormat;

public class WalletManager{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance(); // new number format as 0.00
        
        int input = 0;
        boolean exit = true;

        DigiWallet digiW1 = new DigiWallet();
        DigiWallet digiW2 = new DigiWallet();
        
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

        while(exit){
            digiW1.home();
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println();
            System.out.println("[+] 1 - deposit");
            System.out.println("[-] 2 - withdraw");
            System.out.println("[>] 3 - transfer");
            System.out.println("[?] 4 - change account info");
            System.out.println("[X] 0 - quit");
            input = scan.nextInt();

            if (input == 1){
                System.out.print("[?] Amount to deposit: ");
                System.out.println();
                input = scan.nextInt();
                digiW1.deposit(input);
            }
            if (input == 2){
                System.out.print("[?] Amount to withdraw: ");
                System.out.println();
                input = scan.nextInt();
                digiW1.withdraw(input);
            }
            if (input == 3){
                System.out.print("[?] Amount to transfer: ");
                System.out.println();
                input = scan.nextInt();
                digiW1.withdraw(input);
                digiW1.deposit(input);
            }
            if (input == 4){
                System.out.println();
                System.out.println("What would you like to change");
                System.out.println();
                System.out.println("[N] 1 - Name");
                System.out.println("[/] 2 - Date of Birth");
                System.out.println("[X] 0 - quit");
                input = scan.nextInt();

                if (input == 1){
                    digiW1.setName();
                }
                if (input == 2){
                    digiW1.setBirthDate();
                }
                if (input == 0){
                    // Nothing (quiting)
                }
            }
            if (input == 0){
                exit = false;
            }
            System.out.println("\n\n");
            digiW1.setBalance();
        }
    }
}