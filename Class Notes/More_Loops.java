import java.util.Scanner;

public class More_Loops {
  public static void main(String[] args) {
    /*
    We learned last week about while loops. 
    While loops keep iterating as long as the condition in the loop is true.
    These loops are great when we're not sure when our loop will end
    (Think back to the prime factorization problem on the previous lab,
    we're not sure how many factors each number has, so we have to keep looping
    until we've factored everything).

    Now, we are going to pivot to a different loop with different syntax.
    A "for" loop is defined as follows, and iterates a set number of times.
    */

    /*
    for (<initialization>; <test>; <update>) {
      <body>;
    }

    Here, initialization is initializing an integer variable to some starting value.
    We usually use i as our variable for our loops. 
    The test is the same as the test from the while loop.
    And update changes the value of i in some way. This allows us to "traverse" through the loop.
    i can represent indices in a String, a number in some operation, but importantly
    it allows us to keep our place in the loop. 

    NOTE: i updates after the body of the loop. 
    */

    /*
    for (int i = 0; i < 5; i++);
      System.out.println(i);
    */

    /* 
    String s = "I love loops!";
    for (int i = 0; i < s.length(); i++);
      System.out.println(s.charAt(i));
    */

    /*
    String t = "I love loops!";
    int i = 0
    while (i < t.length()) {
      System.out.println(t.charAt(i));
      i++;
    }
    */

    /*
    We notice that for loops that are going to iterate a fixed number of times, for loops are easier to write.
    This is because when they are defined, they include an iterating variable that updates automatically. 

    Now, there are some loops that are only really feasible with while loops.

    Take, for instance, code that asks the user for a number between 1 and 10 repeatedly until they provide one.
    It's pretty straightforward to write this with a while loop:
    */

    /*
    Scanner in = new Scanner(System.in);
    int number = 0;
    int guess = 7;
    while (number != guess) {
      System.out.println("Guess what number I'm thinking of, it's definitely not " + guess);
      number = in.nextInt();
    }
    System.out.println("You did it!");
    */

    /* 
    But how would we write it with a for loop? It's much harder, since we don't know how many times this loop will run.
    */

    /*
    Let's do a little more practice:
    */

    /*
    String u = "I love loops";
    for (int i = 0; i < u.length(); i++) {
      System.out.println(u.charAt(i));
      System.out.println(u.charAt(u.length() - 1 - u));
    }
  
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
    for (int i = 1; i < 6; i++) {
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
  }
}
