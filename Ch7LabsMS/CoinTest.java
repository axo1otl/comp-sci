public class CoinTest{
    public static void main(String[] args){
        BiasCoin c1 = new BiasCoin();

        c1.flip();
        System.out.println(c1.toString());
        c1.flip();
        System.out.println(c1.toString());
        c1.flip();
        System.out.println(c1.toString());
        c1.flip();
        System.out.println(c1.toString());

        System.out.println("\n");
        c1.setBias(0.6);
        System.out.println("\n");
        
        c1.flip();
        System.out.println(c1.toString());
        c1.flip();
        System.out.println(c1.toString());
        c1.flip();
        System.out.println(c1.toString());
        c1.flip();
        System.out.println(c1.toString());

        
        System.out.println("\n");
        c1.setBias(0.812442);
        System.out.println("\n");
        
        c1.flip();
        System.out.println(c1.toString());
        c1.flip();
        System.out.println(c1.toString());
        c1.flip();
        System.out.println(c1.toString());
        c1.flip();
        System.out.println(c1.toString());

        System.out.println("\n");
        c1.setBias(1.4);
        System.out.println("\n");
    }
}