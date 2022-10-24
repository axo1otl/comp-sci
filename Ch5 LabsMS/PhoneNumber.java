public class PhoneNumber{
    public static void main(String[] args){
        int num1, num2, num3, num4, set3b;
        String set3a, set4;
        
        // first 3 digits
        num1 = (int)(Math.random() * 8);
        num2 = (int)(Math.random() * 8);
        num3 = (int)(Math.random() * 8);
        set3a = "" + num1 + num2 + num3;
        
        // second 3 digits
        set3b = (int)(Math.random() * (799 - 100 + 1)) + 100;
        
        // last 4 digits
        num1 = (int)(Math.random() * 10);
        num2 = (int)(Math.random() * 10);
        num3 = (int)(Math.random() * 10);
        num4 = (int)(Math.random() * 10);
        set4 = "" + num1 + num2 + num3 + num4;
        
        System.out.println("(" + set3a + ")" + set3b + "-" + set4);
        
    }
}