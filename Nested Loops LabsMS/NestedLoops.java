public class NestedLoops{
    public static void main(String[] args){
        for (int x = 1; x <= 5; x++){
            for (int i = 1; i <= x; i++){
                System.out.print(i);
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        for (int x = 1; x <= 5; x++){
            for (int a = 4; a >= x; a--){
                   System.out.print(" "); 
                }
            for (int i = 1; i <= x; i++){
                System.out.print(x);
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        for (int x = 1; x <= 5; x++){
            for (int i = 5; i >= x; i--){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        int s = 9;
        for (int x = 1; x <= s; x++){
            for (int i = s - x; i >= 1; i--){
                System.out.print(" ");
            }
            for (int i = 1; i <= x; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
