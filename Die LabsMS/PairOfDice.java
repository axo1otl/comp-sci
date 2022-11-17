public class PairOfDice{
    private Die d1, d2;
    private int val1, val2, total;
    
    public PairOfDice(){
        d1 = new Die();
        d2 = new Die();
        val1 = 1;
        val2 = 1;
        total = val1 + val2;
    }
    
    public void roll(){
        val1 = d1.roll();
        val2 = d2.roll();
        total = val1 + val2;
        //return total;
    }
    
    public int getTotal(){
        return total;
    }
    public int getDie1(){
        return val1;
    }
    public int getDie2(){
        return val2;
    }
}