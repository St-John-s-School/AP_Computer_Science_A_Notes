import java.util.Scanner;

public class Input{
    public static void main(String[] args)
    {
    /* When wanting to take in input from the user we need to utilize the Scanner library. 
    This allows us to process input from the user in the terminal but how we process the information determines how/what information can be stored.

    The syntax for creating a Scanner object is as follows:
    Scanner input = new Scanner(System.in);    
    */
    
    /* When looking to use a Scanner object we first need to think about what kind of information do we want to store.
       This will determine what kind of input we can accept.
       We have the following options:
       ┌─────────────────────────────┐
       | Data Type   |  Method       |
       ┠─────────────┼───────────────┤
       |   Integer   | nextInt()     |
       ┠─────────────┼───────────────┤
       |   Double    | nextDouble()  |
       ┠─────────────┼───────────────┤
       |   String    | next()        |
       ┠─────────────┼───────────────┤
       |   String    | nextLine()    |
       └─────────────────────────────┘

       The next() method will only accept a string until a whitespace is found (AKA a space)
       The nextLine() method will accept everything typed in before return is entered 
    */

    // Taking in an integer as input
    // Example:
    // Scanner input = new Scanner(System.in);
    // System.out.print("Enter your favorite whole number: ");
    // int number = input.nextInt();
    // System.out.println("Your favorite whole number is " + number + "!");

    // Taking in a double as input
    // Example:
    // Scanner input = new Scanner(System.in);
    // System.out.print("Enter your favorite decimal number: ");
    // double number = input.nextDouble();
    // System.out.println("Your favorite decimal number is " + number + "!");

    // Taking in a string as input
    // Example:
    // Scanner input = new Scanner(System.in);
    // System.out.print("Enter your first and last name: ");
    // String name = input.next();
    // System.out.println("Your name is " + name + "!");
    // System.out.print("Enter your first and last name: ");
    // name = input.nextLine();
    // System.out.println("Your name is " + name + "!");
    // Notice the how the next() method did not capture your last name but nextLine() was able to
      
    // You can find a table of all the Scanner methods in the textbook. 

    
    }
  }
  
