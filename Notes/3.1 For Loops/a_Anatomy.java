import java.util.Scanner;

public class a_Anatomy {
  public static void main(String[] args)
    {
    /*

    So far, we've focused on programs that basically do things once.
    However, today we are going to learn about a specific construct
    that lets us do a specific code segment as many times as we want.

    A "for" loop is defined as follows, and iterates a set number of times.
    */

    /*
    for (<initialization>; <test>; <update>)
    {
      <body>;
    }

    Here, <initialization> is initializing a variable to some starting value.
    We usually use i as our variable for our loops. 

    As an example, we might say int i = 0;

    The <test> is a logical test. It is something that
    will compare our variable to something else and either be true or false. 
    The for loop will run as long as this test evaluates to true.

    And <update> changes the value of i in some way. 
    Usually, it increments i by some value. 

    <body> is the code that the loop will repeatedly run. 
    After the body is over, we will do the <update>. 

    Q: What does the loop below do?

    Q: How many times does it do it?

    Q: What value of i will eventually cause the loop to stop? 

  */

  for (int i = 0; i < 5; i++)
  {
    System.out.println("hi");
  }

  }
}