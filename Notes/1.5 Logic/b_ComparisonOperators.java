public class b_ComparisonOperators
{
/*
We've learned that booleans are used to represent
the answers to yes or no questions. There's an example
in the previous file where we determine if a number is even.
The problem is that, currently, we're the one determining
if 8 is even or not. We need a way for our computer to 
determine whether something is true or false!

Consider the following operators:
== (equality)
!= (non-equality)
< (less than)
> (greater than)
<= (less than or equal to)
>= (greater than or equal to)

These are all operators that will output true, or false

NOTE: The output of these operators is always a boolean.
NOTE: Statements that output T/F are "logical statements"
NOTE: "==" != "="
*/
    public static void main(String[] args)
    {
    System.out.println("---------------------\n");

    int a = 5;
    int b = 4;
    boolean isGreater = (a > b);

    System.out.println("Is " + a +
    " greater than " + b + "? " + isGreater);

    System.out.println("\n---------------------");

    
    // System.out.println("---------------------\n");
    // String s = "hello";
    // String t = "hi";
    // boolean isEqualLength = (s.length() == t.length());

    // System.out.println("Are " + s + " and "
    // + t + " equal length? " + isEqualLength);

    // System.out.println("\n---------------------");
    }

    /*
    Q: Can we declare and initialize a boolean to represent
    whether a String starts with a "j"?
    */

    /*
    Q: Can we write logical statements that calculate the following:
    - Is "banana" longer than "apple?"
    - Is 12 divisible by 4? 
    - Is 8 + 4 less or equal to 13? 
    */
}