import java.util.Scanner;

/*
Now that we can ask users for inputs, we might be interested
in knowing if their String inputs are equal to something.

In Java, we check if two Strings are equal in a very
particular way (with a method).

We use the .equals() method.

For a reason we will talk about in the future,
== does not work when comparing two Strings. 
*/

public class c_StringEquals 
{
    public static void main(String[] args) 
    {
    String a = "bananas";
    String b = new String("bananas");

    System.out.println("---------------------\n");
    System.out.println("Is a == b? " + (a == b));
    System.out.println("Is a .equal() to b? " + a.equals(b));
    System.out.println("Is b .equal() to a? " + b.equals(a));
    System.out.println("\n---------------------");
    }
}