public class RollingDice{
    public static void main(String[] args){
        Die die1;
        int sum;
    
        die1 = new Die();
        Die die2 = new Die();
        
        die1.roll();
        System.out.println("Die one: " + die1.toString());
        
        die2.roll();
        System.out.println("Die two: " + die2);
        
        sum = die1.getFaceValue() + die2.getFaceValue();
        System.out.println("Sum str: " + sum);
        
        sum = die1.roll() + die2.roll();
        System.out.println("Die one: " + die1 + ", Die two: " + die2);
        System.out.println("Sum: " + sum);
    }
}