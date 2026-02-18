public class b_Anatomy
{
    /*
    A Class is a blueprint for Objects.
    If we write code for a Class, we can make Objects of that type. 
    Every Class has three parts:

    1) Field Variables: these are the variables an Object stores. 
    2) Constructor Method: this method defines how to create the Object.
    3) Other Methods: these methods might let the object do other things. 

    */

    /*
    1) Field Variables

    NOTE: These are sometimes called instance variables

    Field variables are declared at the top of the class before any methods.
    They describe what information every Object of this class will hold.

    For a BankAccount, the field variables might be:

    double balance;
    String accountHolderName;

    Unlike other variables that are defined inside a method, field variables
    belong to the Object itself. They always exist! 
    */

    /*
    2) Constructor Method

    The Constructor method is a special method that runs 
    when we want to create a new Object.
    It sets the initial values of the field variables and returns the actual Object.

    The Constructor always has:
    -the same name as the Class
    -no return type (not even void)

    It might look like this:

    public BankAccount(double startingBalance, String newAccountHolder)
    {
        balance = startingBalance;
        accountHolderName = newAccountHolder;
    }

    And we call it like this:

    BankAccount one = new BankAccount(500.0, "Bingo");

    BankAccount two = new BankAccount(751.5, "Bluey");

    Q: What does it look like the body of the constructor does?

    Q: How do we know it's the constructor being called?

    Q: In the code above, how many BankAccount objects now exist? How do they differ?
    */

    /*
    You can also write multiple constructors with different parameters.
    (This is a major throwback, we called this overloading previously)

    A common alternative constructor is shown below. It's called the 
    default constructor, and it has no parameters and sets the field variables
    to default values. We use this when we don't know what data we want our
    Object to have. 

    public BankAccount()
    {
        balance = 0.0;
        accountHolderName = "John Doe";
    }
    */

    /*
    3) Other Methods

    Methods are how we give Objects behaviors.
    They're written just like the other methods we've seen, but they don't
    have the keyword static.

    Static methods are methods that exist independently of a particular Object.
    The methods we will write in classes are part of an Object. Thus, they are NOT static.

    A method for a BankAccount class might look like this:

    public void depositMoney(double amount)
    {
        if (amount > 0.0)
            balance = balance + amount;
    }

    Notice that depositMoney() directly uses the field variable "balance".

    - The field variables at the top are accessible in any method in the class file.

    - Since this method is "part" of an actual BankAccount object, it always
    knows "which" balance variable we are referring to. It's the balance of the 
    BankAccount object that this method is part of. 
    */
}