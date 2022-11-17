public class Account{
    private double balance;
    private String name;
    private long acctNum;
    //----------------------------------------------
    //Constructor -- initializes balance, owner, and account number
    //----------------------------------------------
    public Account(double initBal, String owner, long number){
        balance = initBal;
        name = owner;
        acctNum = number;
    }
    //----------------------------------------------
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    //----------------------------------------------
    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
        }
        else{
            System.out.println("Insufficient funds");
        }
    }
    //----------------------------------------------
    // Adds deposit amount to balance.
    //----------------------------------------------
    public void deposit(double amount){
        balance += amount;
    }
    //----------------------------------------------
    // Returns balance.
    //----------------------------------------------
    public double getBalance(){
        return balance;
    }
    //----------------------------------------------
    // Prints name, account number, and balance.
    //----------------------------------------------
    public void printSummary(){
    //print name
    System.out.println("Owner:\t" + name);
    //print acct number
    System.out.println("Acount Number:\t" + acctNum);
    //print balance
    System.out.println("Balance:\t" + balance);
    }
    //----------------------------------------------
    // Deducts $10 service fee if balance is under $1000
    //----------------------------------------------
    public double chargeFee(){
        if (balance < 1000){
            balance -= 10;
        }
        return (balance);
    }
    //----------------------------------------------
    // Changes the name on the account
    //----------------------------------------------
    public void changeName(String newName){
        name = newName;
    }
}