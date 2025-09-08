/*
On previous assignments, you've written programs
that calculated things like how much to tip,
if a number is a perfect square, and so on.

However, we've needed to define the inputs at
the start of the program. Which isn't that useful
if we want programs other users can use, innit?

We want a way for someone to input a value,
and for us to store and use that value in a program.

In Java, this is done with "Scanner"
*/

import java.util.Scanner;

public class a_Scanner 
{
    public static void main(String[] args) 
    {
    /*
    To make a Scanner variable, we write:

    Scanner in = new Scanner(System.in);

    "in" is actually an Object, but we can
    treat it like a variable for now. 
    It has a declaration looks like that of a variable! 

    Scanner has the following methods.
    nextInt() - reads input and stores as an int
    nextDouble() - reads input and stores as double
    next() - reads input and stores as a String
    nextLine() - reads entire line and stores as a String
    */

    System.out.println("---------------------\n");


    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    System.out.println("a is: " + a);

    System.out.println("\n---------------------");

    /*
    Notice that we say in.method_name();
    Instead of Scanner.method_name();
    This should remind us of String method formatting. 
    */

    // System.out.println("---------------------\n");
    // int b = in.nextInt();
    // int c = in.nextInt(); 
    // if (b > c) 
    // {
    //     System.out.println(b + " is greater than " + c);
    // }
    // else if (b == c)
    // {
    //     System.out.println("The two inputs are equal");
    // }
    // else 
    // {
    //     System.out.println(b + " is less than " + c);
    // }
    // System.out.println("\n---------------------");

    }
}