import java.util.Scanner;

public class BandBoosterManager{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name;
        int sales;
        
        System.out.println("Enter name: ");
        name = scan.next();
        BandBooster booster1 = new BandBooster(name);
        
        System.out.println("Enter amount sold in week 1: ");
        sales = scan.nextInt();
        booster1.updateTotal(sales);
        
        System.out.println("Enter amount sold in week 2: ");
        sales = scan.nextInt();
        booster1.updateTotal(sales);
        
        System.out.println("\nEnter another name: ");
        name = scan.next();
        BandBooster booster2 = new BandBooster(name);
        
        System.out.println("Enter amount sold in week 1: ");
        sales = scan.nextInt();
        booster2.updateTotal(sales);
        
        System.out.println("Enter amount sold in week 2: ");
        sales = scan.nextInt();
        booster2.updateTotal(sales);
        
        System.out.println("\n" + booster1);
        System.out.println(booster2);
    }
}