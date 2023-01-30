public class Account
{
  private double balance;
  private String name;
  private double acctNum;

  private static int deposit;
  private static int withdraw;
  private static double totalDeposit;
  private static double totalWithdraw;

  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, double number)
  {
    balance = initBal;
    name = owner;
    acctNum = number;
  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
    if (balance >= amount){
       balance -= amount;

       withdraw++;              // add the number of withdrawals per day
       totalWithdraw += amount; // add to the amount of cash withdrawn per day
    }
    else{
       System.out.println("Insufficient funds");
    }
  }

  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
    balance += amount;
    deposit++;              // add the number of deposits per day
    totalDeposit += amount; // add to the amount of cash deposited per day
  }

  //----------------------------------------------
  // Return the 4 static variables.
  //----------------------------------------------
  public static int getNumDeposit()
  {
    return(deposit);
  }

  public static int getNumWithdraw()
  {
    return(withdraw);
  }

  public static double getAmountDeposit()
  {
    return(totalDeposit);
  }

  public static double getAmountWithdraw()
  {
    return(totalWithdraw);
  }

  //----------------------------------------------
  // Clear statistics for the day.
  //----------------------------------------------
  public void resetStats()
  {
    deposit = 0;
    withdraw = 0;
    totalDeposit = 0;
    totalWithdraw = 0;
  }

  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
    return balance;
  }

  //----------------------------------------------
  // Returns account number
  //----------------------------------------------
  public double getAcctNumber()
  {
    return acctNum;
  }


  //----------------------------------------------
  // Prints account number, name, and balance
  //----------------------------------------------
  public void printSummary()
  {
      System.out.println("Account number: " + acctNum);
      System.out.println("Account owner: " + name);
      System.out.println("Account balance: " + balance);
  }



}
