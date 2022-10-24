public class Parallel{
    public static void main(String[] args){
        int base, height, side, perim, area;
        
        base = (int)(Math.random() * (30 - 10 + 1)) + 10;
        height = (int)(Math.random() * (30 - 10 + 1)) + 10;
        side = (int)(Math.random() * (30 - 10 + 1)) + 10;
        perim = (side * 2) + (base * 2);
        area = base * height;
        
        System.out.println("The area of a parallelogram with base " + base + " and height " + height + " is " + area);
        System.out.println("The perimeter of a parallelogram with base " + base + " and height " + height + " is " + perim);
    }
}