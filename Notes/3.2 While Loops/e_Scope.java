import java.util.Scanner;

public class e_Scope
{
  public static void main(String[] args)
  {
    /*
    As we gain familiarity with loops,
    we need to understand when variables exist,
    and when they stop existing.

    This idea is called "scope".

    In Java, any variable made inside brackets,
    stops existing outside the brackets.

    - Variables made in a method (parameters) 
    stop existing when the method ends. 

    - Variables made in an if statement stop existing
    when the if statement ends

    - Variables made in loops (like i) stop existing
    when the loop ends.

    So, if you want to use a variable during AND after
    a loop, you need to make the variable before the loop starts.
    Then, in your loop, you can modify that variable as you wish.
    */

    // int i = 0;
    // for (i = 0; i < 10; i++)
    // {
    //     System.out.println(i);
    // }
    // System.out.println("The final value of i is: " + i);
    
    // Notice that i exists outside the loop now! 

    
  }

}
