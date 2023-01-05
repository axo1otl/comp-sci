import java.util.ArrayList;
/**
 * a CoinPurse holds a collection of Coin objects.
 */
public class CoinPurse
{
    ArrayList<Coin> purse;

    /**
     * Constructor for objects of class CoinPurse
     */
    public CoinPurse()
    {
      purse = new ArrayList<Coin>();
        
    }

    /**
     *adds Coin c to the CoinPurse 
     */
    public void addCoin(Coin c)
    {
       purse.add(c);
    }
    
    /**
     *removes Coin c from the CoinPurse 
     */
    public void removeCoin(Coin c)
    {
       purse.remove(c);
    }
    
    /**
     *counts the number of coins in the CoinPurse 
     */
    public int count()
    {
       return(purse.size());
    }
    
    /**
     *returns the total values of all coins in the CoinPurse
     */
    public double total() 
    { 
           double sum = 0.0;
           /*
           for(Coin c: purse){
               // idk how to get the value
           }
           */
          for(int i = 0; i < purse.size(); i++){
              sum += purse.get(i).getValue();
          }
          return(sum/100);
    } 
    /**
     *Prints the vName of each Coin stored in the CoinPurse 
     */
    public String toString()
    {
        String str = "";
        for(int i = 0; i < purse.size(); i++){
              str += purse.get(i).toString() + ", ";
        }
        return(str);
    }
}