import java.util.Scanner;
import java.text.NumberFormat;

public class SoftDrinkMachine{
    Scanner scan = new Scanner(System.in);
    NumberFormat currency = NumberFormat.getCurrencyInstance(); // new number format as 0.00
    
    private int temp = (int)(Math.random() * 143) - 37; // highest temp: 106 lowest temp: -37
    private double cost = 0.00;

    private double money = 0.00;


    public void getTemp(){ // prints the current tempurature
        System.out.println("The current temp is: " + temp);
    }

    public void tellPrice(){ // print the amount of money needed for 1 can
        if (temp < 50){
            cost = 0.5;
        }
        if (temp > 50){
            cost = 0.55;
        }
        if (temp > 60){
            cost = 0.6;
        }
        if (temp > 65){
            cost = 0.65;
        }
        if (temp > 70){
            cost = 0.75;
        }
        if (temp > 75){
            cost = 0.8;
        }
        if (temp > 80){
            cost = 0.85;
        }
        if (temp > 85){
            cost = 0.9;
        }
        if (temp > 90){
            cost = 1;
        }
        System.out.println("The current cost per can is: " + currency.format(cost));
    }

    public void getMoney(){ // ask how much money is going into the machine
        System.out.print("Enter amount of money you are inserting: ");
        money = money + scan.nextDouble();
    }

    public void giveChange(){
        System.out.println("Amount to return: " + currency.format(money));
    }

    public void giveChangeOrNoSale(){
        if (money < cost){
            System.out.println("You entered " + currency.format(money));
            System.out.println("You need " + currency.format(cost));
            System.out.println("Would you like to insert more? ");
            System.out.print("y / n: ");

            if (scan.next().equals("y")){
                money = money;
                getMoney();
                giveChangeOrNoSale();
            }
            else {
                giveChange();
            }
        }
        else{
            System.out.println("Thank you for your purchase!");
            money = money - cost;
            giveChange();
        }
    }

}