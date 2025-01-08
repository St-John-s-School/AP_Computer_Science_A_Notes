import java.util.Scanner;

public class ForLoops {
  public static void main(String[] args) {
    /*
    So far, we've focused on programming problems to do something a specific number of times (usually once).
    However, today we are going to learn about a specific construct
    that lets us loop over a specific code segment as many times as we want.

    A "for" loop is defined as follows, and iterates a set number of times.
    */

    /*
    for (<initialization>; <test>; <update>) {
      <body>;
    }

    Here, <initialization> is initializing an integer variable to some starting value.
    We usually use i as our variable for our loops. 
    The <test> is a logical test. The for loop will run as long as this test evaluates to true.
    And <update> changes the value of i in some way. This allows us to "traverse" through the loop.
    i can represent indices in a String, a number in some operation, but importantly
    it allows us to keep our place in the loop. 

    <body> is the code that the loop will repeatedly run. After the body is over, <update> will happen
    */

    // You can uncomment these or copy and paste these to a new file to see what happens

    /*
    for (int i = 0; i < 5; i++) 
    {
      System.out.println(i);
    }
    */

    /*
    When the above loop starts, i is initialized to 0.
    When it runs for the first time, i is 0, so 0 gets printed.
    When the body of the loop is over, it starts over. 
    The loop will then run with i = 1, i = 2, until i = 4.
    Once i = 5, the loop will stop, since the logical test will now be false. 
    */

    /* 
    String s = "I love loops!";
    for (int i = 0; i < s.length(); i++)
    {
      System.out.println(s.charAt(i));
    }
    */

    /*
    We notice that for loops that are going to happen (iterate) a fixed number of times.
    This is because when they are defined, they include an iterating variable that updates automatically. 

    Let's do a little more practice:

    Try to fully understand what each of the following loops do. It might be useful to actually run the code by hand.
    */

    /*
    String u = "I love loops";
    for (int i = 0; i < u.length(); i++) {
      System.out.println(u.charAt(i));
      System.out.println(u.charAt(u.length() - 1 - u));
    }
  
    */    

    /*
    double k = 64;
    for (int i = 1; i < 6; i++) 
    {
      System.out.println(Math.pow(k, 1.0 / i));
    }
    */

    /*
    String v = "I love loops!";
    for (int i = v.length() - 1; i >= 0; i--) {
      v = v.substring(0, i + 1);
      System.out.println(v.charAt(v.length() - 1));
    }
    */

    /*
    Programming Practice:

    0) Write a program that, using a loop, prints the first five positive integers. 

    1) Write a program that, using a loop, prints the individual characters of a String.

    */
  }
}