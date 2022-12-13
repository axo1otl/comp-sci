import java.util.Scanner;
import java.text.NumberFormat;

public class DigiWallet{
    Scanner scan = new Scanner(System.in);
    NumberFormat currency = NumberFormat.getCurrencyInstance(); // new number format as 0.00

    private double pocket = 0.0;
    private double card1 = 0.0;
    private double card2 = 0.0;
    private double card3 = 0.0;
    private double balance = 0.0;

    private int active = 0;
    
    private String name = "";
    private String fName = "";
    private String lName = "";
    private int birthDay = 0;
    private int birthMonth = 0;
    private int birthYear = 0;
    private String birthDate = "";
    
    private int accountID = 0;
    

    public DigiWallet(){ // default constructor
        pocket = 0.0;
        card1 = 0.0;
        card2 = 0.0;
        card3 = 0.0;
        balance = 0.0;

        active = 0;

        name = "";
        fName = "";
        lName = "";
        birthDay = 0;
        birthMonth = 0;
        birthYear = 0;
        birthDate = "";

        accountID = 0;
    }

    //-----------------------------------------------------------------
    //  ACTIONS
    //-----------------------------------------------------------------
    public void withdraw(int amount){
        boolean exit = true;
        // is amount > balance?
        // if yes then send error
        if (amount > balance){
            System.out.println("[X] ERROR: Insufficient balance.");
        }
        else{   
            while(exit){
                // if no then from what card 1 2 or 3
                //   choice -> active
                System.out.println("[ ] Withdraw from where?");
                System.out.println();
                System.out.println("[P] 0 - Pocket: " + currency.format(pocket));
                System.out.println("[C] 1 - Card 1: " + currency.format(card1));
                System.out.println("[C] 2 - Card 2: " + currency.format(card2));
                System.out.println("[C] 3 - Card 3: " + currency.format(card3));
                System.out.println("[X] 9 - quit");
                active = scan.nextInt();

                // if card balance < 0, call fix method
                if (active == 0){
                    if (amount > pocket){ // overflow control
                        System.out.println("[!] WARNING: Pocket does not have" + currency.format(amount));
                        System.out.println("[!]        : Please try again or cancel.");
                    }
                    else{
                        pocket -= amount;
                        System.out.println("[ ] Successfully withdrew " + currency.format(amount) + " from Pocket!");
                        exit = false;
                    }
                }
                if (active == 1){
                    if (amount > card1){ // overflow control
                        System.out.println("[!] WARNING: Card 1 does not have" + currency.format(amount));
                        System.out.println("[!]        : Please try again.");
                    }
                    else{
                        card1 -= amount;
                        System.out.println("[ ] Successfully withdrew " + currency.format(amount) + " from Card 1!");
                        exit = false;
                    }
                }
                if (active == 2){
                    if (amount > card2){ // overflow control
                        System.out.println("[!] WARNING: Card 2 does not have" + currency.format(amount));
                        System.out.println("[!]        : Please try again.");
                    }
                    else{
                        card2 -= amount;
                        System.out.println("[ ] Successfully withdrew " + currency.format(amount) + " from Card 2!");
                        exit = false;
                    }
                }
                if (active == 3){
                    if (amount > card3){ // overflow control
                        System.out.println("[!] WARNING: Card 3 does not have" + currency.format(amount));
                        System.out.println("[!]        : Please try again.");
                    }
                    else{
                        card3 -= amount;
                        System.out.println("[ ] Successfully withdrew " + currency.format(amount) + " from Card 3!");
                        exit = false;
                    }
                }
                if (active == 9){
                    exit = false;
                }
            }
        }
    }
    
    public void deposit(int amount){
        System.out.println("[ ] Deposit to where?");
        System.out.println();
        System.out.println("[P] 0 - Pocket: " + currency.format(pocket));
        System.out.println("[C] 1 - Card 1: " + currency.format(card1));
        System.out.println("[C] 2 - Card 2: " + currency.format(card2));
        System.out.println("[C] 3 - Card 3: " + currency.format(card3));
        System.out.println("[X] 9 - quit");
        active = scan.nextInt();

        if (active == 0){
            pocket += amount;
            System.out.println("Successfully deposited " + currency.format(amount) + " to pocket!");
        }
        if (active == 1){
            card1 += amount;
            System.out.println("Successfully deposited " + currency.format(amount) + " to Card 1!");
        }
        if (active == 2){
            card2 += amount;
            System.out.println("Successfully deposited " + currency.format(amount) + " to Card 2!");
        }
        if (active == 3){
            card3 += amount;
            System.out.println("Successfully deposited " + currency.format(amount) + " to Card 3!");
        }
        if (active == 9){
            // nothing
        }
    }

    //-----------------------------------------------------------------
    //  CARD / POCKET MANAGMENT
    //-----------------------------------------------------------------
    public void setCard1(int amount){
        card1 += amount;
    }

    public double getCard1(){
        return(card1);
    }

    public void setCard2(int amount){
        card2 += amount;
    }

    public double getCard2(){
        return(card2);
    }

    public void setCard3(int amount){
        card3 += amount;
    }

    public double getCard3(){
        return(card3);
    }

    public void setPocket(int amount){
        pocket += amount;
    }

    public double getPocket(){
        return(pocket);
    }

    public void setBalance(){
        balance = pocket + card1 + card2 + card3;
    }

    public double getBalance(){
        return(balance);
    }

    //-----------------------------------------------------------------
    //  ACCOUNT MANAGMENT
    //-----------------------------------------------------------------
    public void setName(){
        System.out.print("[?] Enter your first name: ");
        fName = scan.next();

        System.out.print("[?] Enter your last name: ");
        lName = scan.nextLine();

        name = fName + " " + lName;
    }

    public String getName(){
        return(name);
    }

    public String getFirstName(){
        return(fName);
    }

    public void setBirthDate(){
        System.out.print("[?] month: ");
        birthMonth = scan.nextInt();
        System.out.print("[?] day: ");
        birthDay = scan.nextInt();
        System.out.print("[?] year: ");
        birthYear = scan.nextInt();

        birthDate = birthMonth + "/" + birthDay + "/" + birthYear;
    }

    public String getBirthDate(){
        return(birthDate);
    }

    public void setID(int id){
        accountID = id;
    }

    public void home(){
        System.out.println("Hello, " + name + "!");
        System.out.println("");
        System.out.println("");
        System.out.println("Balance: " + currency.format(balance));
        System.out.println("");
        System.out.println("Pocket: " + currency.format(pocket));
        System.out.println("Card 1: " + currency.format(card1));
        System.out.println("Card 2: " + currency.format(card2));
        System.out.println("Card 3: " + currency.format(card3));
        System.out.println("");
        System.out.println("");
        System.out.println("ID: " + accountID);
    }
}