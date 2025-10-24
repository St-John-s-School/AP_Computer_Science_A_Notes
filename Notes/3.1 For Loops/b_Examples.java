import java.util.Scanner;

public class b_Examples
{
  public static void main(String[] args)
  {
    /*
    We can use loops to do the same thing over and over, but we can also
    use the fact that the value of i changes to make it do different things over and over.
    This is VERY useful. 

    Consider the example below. 

    Q: Identify each part of the loop. 

    Q: What does this loop do? 

    Q: How can we modify this loop to happen 10 times?

    Q: How can we modify this loop to print out only even numbers?

    */
    
    for (int i = 0; i < 5; i = i + 1)
    {
        System.out.println(i); 
    }

    /*
    When the above loop starts, i is initialized to 0.
    When it runs for the first time, i is 0, so 0 gets printed.
    When the body of the loop is over, the update happens,
    and then it starts over.
    So, when i = 1, 1 will get printed.
    Then, when i = 2, 2 will get printed.
    Then, when i = 3, 3 will get printed.
    Then, when i = 4, 4 will get printed.
    After 4 is printed, i will increment to 5,
    then, the loop will stop, since the logical test will now be false. 
    */

    /*
    Now consider this loop that involves a String variable.

    Q: How does i relate to the String? 

    Q: What are we doing over and over?

    */

    // String s = "I love loops!";
    // for (int i = 0; i < s.length(); i++)
    // {
    //   System.out.println(s.charAt(i));
    // }

  }
}



