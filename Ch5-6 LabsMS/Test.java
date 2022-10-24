import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String screen = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
        int x = 0;
        
        // go ->
        
        while (x < 1000){
            x = x + 1;
            System.out.println(screen + Math.random());
        }
        
        //System.out.println(screen);
    }
}