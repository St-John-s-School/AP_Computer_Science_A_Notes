public class a_Recap
{
    public static void main(String[] args)
    {
        /*
        To recap:

        1) A Class is a blueprint for Objects.
           Once we write a Class, 
           we can create as many Objects from it as we want.

        2) Every Class has three parts:
           1) Field variables: the data each Object stores
           2) Constructor(s): create the Object and set initial values
           3) Other methods: gets, sets, other behaviors

        3) Field variables should be private (encapsulation).
           We don't want outside code reaching in and changing our data directly.
           Instead, we write getters and setters to control access.

        4) Constructors have the same name as the Class and no return type.
           You can have multiple constructors (overloading).
           A default constructor has no parameters and uses default values.

        5) Methods written inside a Class do NOT have the keyword static.
           They belong to an Object and can directly use the field variables.
           We call them using dot notation: object.methodName()
           Every Object has its own copy of each method.

        Finally, one thing we didn't talk about but needs to be 
        talked about again is the fact that:

        Objects can be passed as parameters to methods.
        The method receives a reference to the same Object, not a copy.
        */

        /*
        BankAccount had:

        Field variables: balance, accountHolderName
        Constructors:    BankAccount(double, String) and BankAccount()
        Methods:         depositMoney(), withdrawMoney(), getBalance(), 
                         setBalance(), transferToOtherAccount(), etc.
        */
    }

}
