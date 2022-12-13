public class CollegeInANutShell{
    public static void main(String[] args){
        for (int i = 0; i < 1000; i++){
            System.out.println("["+(i+1)+"]\t" + (int)(Math.random() * 1000000) + 1);
        }
    }
}