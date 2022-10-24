public class Dice{
    public static void main(String[] args){
        int die1, die2, total;
        
        die1 = (int)(Math.random() * 6) + 1;
        die2 = (int)(Math.random() * 6) + 1;
        
        System.out.println("You rolled a " + die1 + " and a " + die2 + " for a total of " + (die1 + die2));
    }
}