
public class d_UsingObjects
{
    public static void main(String[] args)
    {
        /*
        Now that we understand what a Class is, let's practice using one.
        We'll work with BankAccount, which has already been written for us.

        Most of this file will look like Review. 
        */

        /*
        To create a new Object, we call a Constructor using "new".
        If we call the default constructor:
        */

        BankAccount bellamkondaAcc = new BankAccount();
        bellamkondaAcc.printAccountInfo();

        // What code can we add to change the name variable of Ms. Bellamkonda's account? 

        /*
        If we use the constructor with parameters, we set the state right away:
        */

        // BankAccount gaoAcc = new BankAccount(300.0, "Gao");
        // gaoAcc.printAccountInfo();

        /*
        We call methods on Objects using dot notation: object.methodName()
        The Object to the left of the dot is the Object who we are calling the method on.
        Maybe we want to change or get its data.
        */

        // bellamkondaAcc.depositMoney(200.0);
        // bellamkondaAcc.printAccountInfo();

        // bellamkondaAcc.depositMoney(-50.0); 
        // bellamkondaAcc.printAccountInfo();

        /*
        We can use setter methods to update field variables:
        */

        // BankAccount classAcc = new BankAccount(); 

        // classAcc.setAccountHolderName("?");
        // classAcc.printAccountInfo();

        /*
        And getter methods to read them:
        */

        // double currentBalance = classAcc.getBalance();
        // System.out.println("Class's balance: " + currentBalance);

        /*
        Objects can be passed as parameters to methods.
        This is how transferToOtherAccount() works.

        Be careful: the Object calling the method and the Object
        passed in as a parameter are two different things.

        In the line below, gaoAcc is calling the method,
        so money flows OUT of gaoAcc and INTO classAcc.
        */

        // BankAccount gaoAcc = new BankAccount(1000.0, "Mr. Gao");
        // BankAccount classAcc = new BankAccount(5.0, "Students");
        // gaoAcc.transferToOtherAccount(classAcc, 100.0);
        // gaoAcc.printAccountInfo(); 
        // classAcc.printAccountInfo();
    }
}