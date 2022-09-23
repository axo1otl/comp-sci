import java.util.Scanner;
public class Paint {
    public static void main(String[] args) {
        final int COVERAGE = 350; //paint covers 350 sq ft/gal
        Scanner scan = new Scanner(System.in);
        int length, width, height; //declare integers length, width, and height;
        double totalSqFt;          //declare double totalSqFt;
        double paintNeeded;        //declare double paintNeeded;
        int doors, windows;
        
        //Prompt for and read in the length of the room
        System.out.print("What is the length of the room? ");
        length = scan.nextInt();
        //Prompt for and read in the width of the room
        System.out.print("What is the width of the room? ");
        width = scan.nextInt();
        //Prompt for and read in the height of the room
        System.out.print("What is the height of the room? ");
        height = scan.nextInt();
        
        System.out.print("How many doors do you have? ");
        doors = scan.nextInt();
        
        System.out.print("How many windows do you have? ");
        windows = scan.nextInt();
        //Compute the total square feet to be painted--think
        //about the dimensions of each wall
        //Compute the amount of paint needed
        //Print the length, width, and height of the room and the
        //number of gallons of paint needed.
        totalSqFt = (width * height * 2) + (length * height * 2) - ((doors * 20) + (windows * 15));
        paintNeeded = Math.ceil(totalSqFt / 350);
        System.out.println("You need " + (int)paintNeeded + " gallons of paint to cover " + totalSqFt + "sq ft");
    }
}