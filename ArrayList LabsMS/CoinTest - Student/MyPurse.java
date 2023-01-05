public class MyPurse
{
    public static void main(String[] args)
    {
        CoinPurse mine = new CoinPurse();
        Coin c1 = new Coin(25);
        Coin c2 = new Coin(10);
        Coin c3 = new Coin(5);
        Coin c4 = new Coin(1);
        Coin c5 = new Coin(25);
        
        mine.addCoin(c1);
        mine.addCoin(c2);
        mine.addCoin(c3);
        mine.addCoin(c4);
        mine.addCoin(c5);
      
        //Count the total number of Coins in the CoinPurse
        System.out.println("Total coins in your purse are: " + mine.count());
       
        //Total the Coin in the CoinPurse
        System.out.println("Total cost in your purse are: " + mine.total());
        
        //Print the CoinPurse
        System.out.println(mine.toString());
    }
}
        