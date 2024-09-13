/*
Notes Outline:
0) Lab 4 Problem 4 Walkthrough
1) Scanner
2) Practive
3) Lab 5
*/

/*
0) Lab 4 Problem 4 Walkthrough

   People generally did a good job on this problem. If you can stomach working on hard problems like this,
   then you are set up for success in this course (and I would argue also in life). 

   I'm going to present a solution to this when the regions are guaranteed to be convex. A convex
   quadrilateral is one where no angles are greater than 180 degrees. 
*/

import java.util.Scanner;

public class Input 
{
    public static void main(String[] args) 
    {
    /*
    1) Input

    We're going to learn how to interact with the user. Before now, we had to just set variables
    certain values. Ideally, what we would like to do is ask the user for some information.

    For example, a program that calculates a user's letter grade or calculates if a point is in a region
    doesn't really matter that much if we can't ask the user for their grade or for coordinates of points.

    To do this, we lean on a particular class (collection of code) called Scanner.

    To make a Scanner object (something which can read in data), we write:

    Scanner in = new Scanner(System.in);
    */

    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    System.out.println("a is: " + a);

    /*
    Scanner has a few relevant methods. Notice that we say in.method_name();
    This should remind us of String methods in that we are re-using the
    variable_name.method_name() formatting.

    Methods:
    0) nextInt() stores the user input as an integer
    1) next() stores the next input (until a space) as a String
    2) nextInt() stores the entire next input (until Enter is pressed) as a String
    3) nextDouble() stores the user input as a double

    Other Notes:
    - You only need one Scanner object per program. You can use multiple methods on the same one.
    - Be careful with what data types each Scanner method outputs
    */

    int b = in.nextInt();
    int c = in.nextInt(); 
    if (b > c) 
    {
        System.out.println(b + " is greater than " + c);
    }
    else if (b == c)
    {
        System.out.println("The two inputs are equal");
    }
    else 
    {
        System.out.println(b + " is less than " + c);
    }

    // Sometimes, when you use Scanner, empty lines get read in by Scanner
    // This causes issues when you want to use nextLine, since those empty lines are not what you want
    // To work around this, you can just have an extra nextLine() method call. 
    // This "clears" the empty line stored in Scanner

    in.nextLine();

    System.out.print("Please enter your full name ");
    String s = in.nextLine();

    if (!s.contains(" "))
    {
        System.out.println("Please enter your full name, not part of it!");
    }
    else
    {
        System.out.println("Hi, " + s);
    }
    
    /*
    2) Practice

    Problem 0) Write a program that asks a user for two integers, then prints out the sum of those integers.

    */

    /*
    3) Lab 5

    Due: 9/18 for both D and E carriers

    */

    }
}