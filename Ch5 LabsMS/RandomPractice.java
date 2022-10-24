public class RandomPractice{
    public static void main(String[] args){
        int num1;
        double num2;
        
        // 0 to 9
        num1 = (int) (Math.random() * 10);
        System.out.println("0 to 9: " + num1);
        
        // 1 to 10
        num1 = (int) (Math.random() * 10) +1;
        System.out.println("1 to 10: " + num1);
        
        // 20 to 32
        num1 = (int) (Math.random() * (32 - 20 + 1)) +20;
        System.out.println("20 to 32: " + num1);
        
        // -10 to 25
        num1 = (int) (Math.random() * (25 + 10 + 1)) -10;
        System.out.println("-10 to 25: " + num1);
        
        // true math.random
        num2 = Math.random();
        System.out.println("True return: " + num2);
        
        // 0.0 to 5.9999999
        num2 = Math.random() * 6;
        System.out.println("0.0 to 5.999: " + num2);
        
        // 1 to 6
        num2 = (int)(Math.random() * 6) + 1;
        System.out.println("1 to 6: " + num2);
    }
}