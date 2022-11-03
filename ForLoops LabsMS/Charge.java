import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Charge{
    public static void main(String[] args){
        NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);

        Scanner scan = new Scanner(System.in);
        double balance, additional, interest, newBalance, min;
        
        System.out.print("Previous Balance: $");
        balance = scan.nextDouble();
        
        System.out.print("Additional Charges: $");
        additional = scan.nextDouble();
        
        interest = (balance + additional) * 0.02;
        newBalance = balance + additional + interest;
        
        System.out.println("");
        
        System.out.println("CS CARD International Statement");
        System.out.println("===============================\n");
        System.out.println("Previous Balance:\t$" + nf.format(balance));
        System.out.println("Additional Charges:\t$" + nf.format(additional));
        System.out.println("Interest:\t\t$" + nf.format(interest));
        
        System.out.println("\nNew Balance:\t\t$" + nf.format(newBalance));
        
        if (newBalance < 50){
            min = newBalance;
        }
        else if (newBalance >= 50 && newBalance <= 300){
            min = 50;
        }
        else if (newBalance > 300){
            min = newBalance * 0.2;
        }
        else{
            System.out.println("ERROR");
            min = 2147483647;
            min++;
        }
        
        System.out.println("\nMinimum Payment:\t$" + nf.format(min));
    }
}

/*

  ／|、
（ﾟ､ ｡７
 |、ﾞ~ヽ
 じしf_, )ノ

*/