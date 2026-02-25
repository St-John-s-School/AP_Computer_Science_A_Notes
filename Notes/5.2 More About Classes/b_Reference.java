import java.util.*;

public class b_Reference
{
    /*
    Before we do more with Classes,
    there's one more concept we need to review
    which we call "pass by reference"

    Consider this method:

    public static void doubleIt(int x)
    {
        x = x * 2;
    }

    And this code in main:

    int a = 5;
    doubleIt(a);
    System.out.println(a);

    Q: What does this print? 10 or 5?
    */

    public static void doubleIt(int x)
    {
        x = x * 2;
    }

    /*
    When we pass a primitive type (int, double, boolean, etc.)
    to a method, Java makes a copy of the value. The method receives the copy.
    That copy gets deleted when the method ends. :(

    This is called "pass by value"
    */

    /*
    Now consider what happens when we pass an Object to a method.

    Remember: a variable that holds an Object doesn't actually hold the Object itself.
    It holds a REFERENCE (an address) that points to where the Object lives in memory.

    Think back to when we tried to print Arrays and got something like:
    I@19518513591. That long String of characters is the address of the data 
    in your computer's memory. 

    When we pass an Object to a method, Java copies the REFERENCE, not the Object.
    Then, if our method goes to the copy of the reference location, where does it go?

    So, any changes a method makes to an Object will happen to the original. 
    */

    /*
    This is useful when we want to change Objects on purpose. 

    public void transferToOtherAccount(BankAccount otherAccount, double amount)
    {
        otherAccount.depositMoney(amount);
        this.withdrawMoney(amount);
    }

    When we call: gaoAcc.transferToOtherAccount(classAcc, 100.0);

    The parameter "otherAccount" gets a copy of the reference to classAcc.
    "classAcc" (in main) and "otherAccount" (in the method) are the same. 

    So, when the method calls otherAccount.depositMoney(amount),
    classAcc's balance actually increases.
    */

    /*
    However, this fact can also lead to bugs. 

    Let's say you're writing a method that is supposed to just
    read information from an Object, not change it. If you're not careful,
    you might accidentally modify it anyway.
    */

    public static void printSorted(ArrayList<String> names)
    {
        Collections.sort(names);
        System.out.println("Sorted: " + names);
    }

    /*
    This method looks fine. It sorts a list and prints it. 
    But here's the problem: Collections.sort() is a method
    that accepts the Object "names" as a parameter.

    Since "names" is a reference to the original list,
    the original list is now sorted too. That might not be what we wanted.

    For example, we won't have the original list anymore if we run 
    printSorted().

    Q: How do we fix this issue?

    We make a copy of the original and use that copy as the parameter.

    This idea of protecting the original by making a copy is one
    of the most important habits in programming. Generally,
    it is considered good programming practice to not modify
    Objects in methods unless that is the sole purpose of the method. 
    */
}