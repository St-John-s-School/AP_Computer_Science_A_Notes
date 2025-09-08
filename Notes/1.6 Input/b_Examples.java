/*
Any file where you want to use Scanner,
you need to import it.

The syntax for this is:
import java.util.Scanner;

and it goes above the public class ... 
*/

import java.util.Scanner;

public class b_Examples 
{
    public static void main(String[] args) 
    {
    /*
    A nice way to think about Scanner
    is that we haven't really learned any 
    new program logic. We just have the
    ability to ask for the value of certain
    variables. 
    */

    System.out.println("---------------------\n");

    Scanner in = new Scanner(System.in);
    System.out.println("What is your first name?");
    String first = in.next();
    System.out.println("What is your last name?");
    String last = in.next();
    System.out.println("Hello, " + first + " " + last);

    System.out.println("\n---------------------");

    /*
    If we look at the example above
    this is the same as a program where we
    hypothetically just told someone to 
    write their first and last name on the 
    right hand side of an equals sign. 
    */

    /*
    Can we write a program together that 
    asks the user for two integers, and 
    prints out the larger one? 
    */

    // 

    }
}