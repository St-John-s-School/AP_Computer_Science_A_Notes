public class BankAccount
{
   // Field Variables (or Instance Variables)
   private double balance;
   private String accountHolderName;

   // Constructors

   public BankAccount(int newAccountNumber, double startingBalance, String newAccountHolder)
   {
       balance = startingBalance;
       accountHolderName = newAccountHolder;
   }

   public BankAccount()
   {
       balance = 0.0;
       accountHolderName = "John Doe";
   }

   // Other Methods

   public void printAccountInfo()
   {       
      System.out.println("Account holder: " + accountHolderName);
      System.out.println("Balance: " + balance);
   }

   public void depositMoney(double amount)
   {
        if(amount > 0.0)
            balance = balance + amount;
   }

   public void withdrawMoney(double amount)
   {
        if(amount > 0.0)
            balance = balance - amount;
   }

   public void transferToOtherAccount(BankAccount otherAccount, double amount)
   {
       otherAccount.depositMoney(amount);
       this.withdrawMoney(amount);
   }

   public void transferFromOtherAccount(BankAccount otherAccount, double amount)
   {
       otherAccount.withdrawMoney(amount);
       this.depositMoney(amount);
   }

   public void setAccountNumber(int newAccountNumber)
   {
       accountNumber = newAccountNumber;
   }

   public double getBalance()
   {
       return balance;
   }

   public void setBalance(double newBalance)
   {
       balance = newBalance;
   }

   public String getAccountHolderName()
   {
       return accountHolderName;
   }

   public void setAccountHolderName(String newAccountHolderName)
   {
       accountHolderName = newAccountHolderName;
   }
}
