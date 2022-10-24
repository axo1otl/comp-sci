public class Lotto{
    public static void main(String[] args){
        int num1, num2, num3, num4, num5, powerball;
        
        num1 = (int)(Math.random() * 59) + 1;
        num2 = (int)(Math.random() * 59) + 1;
        num3 = (int)(Math.random() * 59) + 1;
        num4 = (int)(Math.random() * 59) + 1;
        num5 = (int)(Math.random() * 59) + 1;
        powerball = (int)(Math.random() * 35) + 1;
        
        System.out.println("Your lotto numbers for today are: \n" + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + "\nPowerball#: " + powerball);
    }
}