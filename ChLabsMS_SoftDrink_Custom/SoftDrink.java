import java.util.Scanner;
import java.text.NumberFormat;

public class SoftDrink{
    public static void main (String[] args){
        SoftDrinkMachine drink = new SoftDrinkMachine(); // create new drink called "drink"
        NumberFormat format = NumberFormat.getCurrencyInstance(); // new number format as 0.00

        drink.getTemp();
        drink.tellPrice();
        drink.getMoney();
        drink.giveChangeOrNoSale();

    }
}