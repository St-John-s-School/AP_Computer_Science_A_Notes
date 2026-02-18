public class c_Encapsulation {
    /*
    You may have noticed that in BankAccount.java,
    all the field variables are declared with the keyword "private":

    private double balance;
    private String accountHolderName;

    Q: What does "private" mean, and why do we do this?
    */

    /*
    In Java, "public" means any code anywhere can access this variable or method.
    This even means other files.

    "private" means only code inside this class (file) can access it.

    We make field variables private because we don't want outside code
    reaching in and changing them directly.

    Think about it from a real-world perspective:
    If you are Bank of America, you do NOT want a user going into
    their account and directly setting their balance to $1,000,000.

    If balance is private, they can't do this:
    balance = 1000000.0;

    Q: Based on the code in BankAccount.java, what is the only way to 
    change the balance of a BankAccount Object?

    Q: Who wrote the code for the previous answer?

    This idea of hiding how your code actually works and only letting
    the user operate with methods you wrote is called "encapsulation".

    You've basically cordoned off the code for your Object so that the user
    cannot see it or break it.
    */

    /*
    Q: If field variables are private, how does outside code read or change them?

    Answer: We write methods called getters and setters.

    A *getter* (also called an accessor) returns the value of a field variable:

    public double getBalance()
    {
        return balance;
    }

    A *setter* (also called a mutator) changes the value of a field variable:

    public void setBalance(double newBalance)
    {
        balance = newBalance;
    }

    Now, if we want to know someone's balance, we call:
    double b = myAccount.getBalance();

    And if we want to change it, we call:
    myAccount.setBalance(200.0);

    This might seem like extra steps for the same result, 
    but the key is that setters let us add rules.

    For example, depositMoney() in BankAccount.java checks that
    the amount is positive before adding it. We can't do this extra
    check if we just let users access the variable on their own.

    Maybe they'll try to deposit a negative amount. This is *why*
    we're writing the Objects ourselves. 
    So that other people have to use them correctly. 
    */

    /*
    Sometimes inside a method, you'll see the keyword "this".
    "this" refers to the Object that is calling the method.

    For example, in BankAccount.java:

    public void transferToOtherAccount(BankAccount otherAccount, double amount)
    {
        otherAccount.depositMoney(amount);
        this.withdrawMoney(amount);
    }

    Here, "this" means "the BankAccount that called transferToOtherAccount".
    It's a way of being specific about which Object you mean
    when there are multiple Objects in the method body.
    */
}