import java.util.Scanner;

public class NameManager{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String f1, m1, l1, full1;
        String f2, m2, l2, full2;
        
        System.out.println("Enter your first name");
        f1 = scan.next();
        System.out.println("Enter your middle name");
        m1 = scan.next();
        System.out.println("Enter your last name");
        l1 = scan.next();
        Names friend1 = new Names(f1,m1,l1);
        System.out.println("Hello! " + friend1.getFirst() + " " + friend1.getMiddle() + " " + friend1.getLast());
        
        System.out.println("\nEnter a friends first name");
        f2 = scan.next();
        System.out.println("Enter a friends middle name");
        m2 = scan.next();
        System.out.println("Enter a friends last name");
        l2 = scan.next();
        Names friend2 = new Names(f2,m2,l2);
        System.out.println("Hello! " + friend2.getFirst() + " " + friend2.getMiddle() + " " + friend2.getLast());
        
    }
}