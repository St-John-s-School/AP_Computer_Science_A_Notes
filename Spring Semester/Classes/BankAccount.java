public class BankAccount
{
   private int accountNumber;
   private double balance;
   private String accountHolderName;

   public BankAccount()
   {
       accountNumber = 1;
       balance = 0.0;
       accountHolderName = "John Doe";
   }

   public BankAccount(int newAccountNumber, double startingBalance, String newAccountHolder)
   {
       accountNumber = newAccountNumber;
       balance = startingBalance;
       accountHolderName = newAccountHolder;
   }

   public void printAccountInfo()
   {       
      System.out.println("Account holder: " + accountHolderName);
      System.out.println("Account number: " + accountNumber);
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

   public int getAccountNumber()
   {
       return accountNumber;
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

