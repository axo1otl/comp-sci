import java.util.Scanner;

public class MuliplicationTable{
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        int size;
        
        System.out.print("Enter how far table should go: ");
        size = scan.nextInt();
        
        int[][] table = new int[size][size];
        
        for (int i = 0; i < table.length; i++){
            for (int k = 0; k < table[0].length; k++){
                table[i][k] = (i+1) * (k+1);
                System.out.print(table[i][k] + "\t");
            }
            System.out.println();
        }
    }
}
