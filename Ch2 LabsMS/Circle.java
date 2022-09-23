import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        final double PI = 3.14159;
        
        Scanner scan = new Scanner(System.in);
        int radius;
        
        System.out.print("Enter a radius: ");
        radius = scan.nextInt();
        
        double area = PI * (radius * radius);
        double circumfrence = 2 * PI * radius;
        
        int radius1 = 2 * radius;
        double area1 = PI * (radius1 * radius1);
        double circumfrence1 = 2 * PI * radius1;
        
        System.out.println("The area of a circle with radius " + radius +
        " is " + area);
        System.out.println("The circumfrence of a circle with radius " + radius +
        " is " + circumfrence);
        
        System.out.println("The area of a circle with radius " + radius1 +
        " is " + area1);
        System.out.println("The circumfrence of a circle with radius " + radius1 +
        " is " + circumfrence1);
        
        System.out.println("The difference of area between a circle with radius "
         + radius + " and " + radius1 + " is " + (area1 / area));
         System.out.println("The difference of circumfrence between a circle with radius "
         + radius + " and " + radius1 + " is " + (circumfrence1 / circumfrence));
    }
}