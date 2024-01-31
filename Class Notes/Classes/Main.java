
public class Main
{
    public static void main(String[] args)
    {
        /*
        So far we've mostly thought of programming as a set of steps of in a procedure
        We'll keep thinking this way, but we're also going to think about the importance
        of Objects when we write code.

        Simply stated, an Object is the combination of state and behavior.
        We think of state as the internal values stored by an object,
        and we think of behavior as the set of actions that an object can perform.
        Some of these actions will either change or use the current state of an Object.

        As an analogy, the Board object from Tic-Tac-Toe had variables like topRow
        as part of it's state (information stored in the object) as well as behavior
        related to setting or accessing that data.

        Ultimately, the reason that Object-oriented programming is important is that
        we can now construct Objects in code which are representations of real world
        entities. This is going to help us conceptualize what is going on and keep
        really complex programs more simple. 
        */

        /*
        So now we're formally going to introduce the idea of a Class. Classes are
        blueprints for Objects, and they do three things. 

        1) They construct Objects (with the constructor method)
        2) They define the state of an Object (with field variables)
        3) They define the behavior of an Object (with methods) 

        Since it's a blueprint, a Class can make as many Objects as we need,
        and each Object, even though they are of the same class, is distinct from
        the other. 

        In Java, Classes correspond to files. Notice how every .java file we have
        starts with public class <class_name>. The class name and file names
        always match (in fact Java gets mad when this isn't true)
        */
    
        /*
        Let's think about writing our own Class. Notice that by doing this,
        we are really building an Object from stratch. 

        This affords us a lot of flexibility. If we need to represent in code
        a particular real life object with particular state (variables) and behaviors
        (methods), we will, after today, be able to do that.

        In essence, we are the gods of our our little computer universe. 
        */
        
        // Construct boundsAcc with the default BankAccount constructor
        // Initially this will set all of our field variables in BankAccount
        // Notice that all field variables are private
        // This is always true because we want obfuscate data.
        // In layman's terms, we don't want users to be able to improperly use our code. 
        // Another way of saying it is that we only want them to interact with our objects' state in sanctioned ways (methods)
        // If you are Bank of America, you don't want users going in and editing their balance. 
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


        // Utilizing the depositMoney() we can see that we can
        // control the users ability to correctly insert 
        // a positive amount of money that impacts the account's balance
        /*
        boundsAcc.depositMoney(-150.0);  
        boundsAcc.printAccountInfo();
        boundsAcc.depositMoney(150.0);  
        boundsAcc.printAccountInfo();
        // */

        // Utilizing the withdrawMoney() we can see that we can
        // control the users ability to correctly insert 
        // a positive amount of money that impacts the account's balance
        /*
        boundsAcc.withdrawMoney(-140.0);  
        boundsAcc.printAccountInfo();
        boundsAcc.withdrawMoney(140.0);  
        boundsAcc.printAccountInfo();
        // */
        
        // Utilizing the new constructor we can create a new BankAccount 
        // object with a lot less steps then before
        // Notice that we were the ones to write this constructor, so
        // you get to control the initial state of the objects. 
        // In essence, you decide what all the objects the user makes will look like. 
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
