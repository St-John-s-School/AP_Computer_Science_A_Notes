
public class Main
{
    public static void main(String[] args)
    {
        // Construct boundsAcc with the default BankAccount constructor
        // Initially this will set all of our field variables in BankAccount
        BankAccount boundsAcc = new BankAccount();

        // Print out the accounts info
        boundsAcc.printAccountInfo();

        // Utilizing the mutator methods we can define what infomration
        // the boundsAcc contains
        /*
        boundsAcc.setAccountHolderName("Mr. Bounds");
        boundsAcc.setAccountNumber(1234);
        boundsAcc.setBalance(800.0);        
        boundsAcc.printAccountInfo();
        // */


        // Utilizng the depositMoney() we can see that we can
        // constrol the users ability to correctly insert 
        // a positive amount of money that impacts the accounts balance
        /*
        boundsAcc.depositMoney(-150.0);  
        boundsAcc.printAccountInfo();
        boundsAcc.depositMoney(150.0);  
        boundsAcc.printAccountInfo();
        // */

        // Utilizng the withdrawMoney() we can see that we can
        // constrol the users ability to correctly insert 
        // a positive amount of money that impacts the accounts balance
        /*
        boundsAcc.withdrawMoney(-140.0);  
        boundsAcc.printAccountInfo();
        boundsAcc.withdrawMoney(140.0);  
        boundsAcc.printAccountInfo();
        // */
        
        // Utilizing the new constructor we can create a new BankAccount 
        // object with a lot less steps then before
        /*
        BankAccount gaoAcc = new BankAccount(12345, 500.0, "Mr. Gao");
        gaoAcc.printAccountInfo();
        // */

        // Notice that the BankAccount that calls the method determines the 
        // direction of the flow of money from one account to the other
        /*
        gaoAcc.transferFromOtherAccount(boundsAcc, 100.0);
        gaoAcc.printAccountInfo();
        boundsAcc.printAccountInfo();
        // */

        // Much like the method above be aware of which BankAccount is calling
        // the transferToOtherAccount() 
        /*
        gaoAcc.transferToOtherAccount(boundsAcc, 100.0);
        gaoAcc.printAccountInfo();
        boundsAcc.printAccountInfo();
        // */


    }
}
