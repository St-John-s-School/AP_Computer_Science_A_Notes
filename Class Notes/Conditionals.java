public class Conditionals{
    public static void main(String[] args)
    {
    /* We might want to execute code depending on something 
    As a real world analogy, we might only want to bring an umbrella to school on days it's projected to rain.
    Or in a program we're writing, we might only want to run a segment of code dividing a number by two if we're sure
    that number is even. 
    
    The idea that we can execute particular segments of code sometimes is super powerful.
    We do this with if/else statements. 
    General form: 
    
    if (test) {
    code segment 
    }
    */
    
    // The content of a test is a boolean expression of some kind. As a result, it'll either be true or false    
    // if the test evaluates to true, then the code segment will run. Otherwise, it gets skipped over.  

    // Example:
    // int number = 5; 
    // if (number >= 0) {
    //     System.out.println(number + " is non-negative"); 
    // }

    // You can express alternatives to if statements by adding else statements to them.
    // Example:

    // int new_number = -5; 
    //  if (new_number >= 0) {
    //     System.out.println(new_number + " is non-negative"); 
    // }
    // else {
    //     System.out.println(new_number + " is negative");
    // }
    
    // We can also put multiple conditions in a single test. At the end of the day, these conditions will either
    // evaluate to true or false. 

    // Example:
      
    // int newer_number = 12;
    // if (newer_number % 2 == 0 && newer_number % 3 == 0) {
    //     System.out.println(newer_number + " is divisible by " + 6); 
    // }

    // You can find a table of all the logical operators and what they do in the textbook. 

    /*
    It's an important skill to be able to evaluate if/else statements by hand. Doing this helps us make sure
    we're writing logically consistent and correct statements. 
    Let's practice on the following chunks of code.
    
    // Practice Problem 1 
    */

    // String s = "Test"; 
    // String t = "Problem";
    // String u = "Conditional"; 

    // if (s.length() + t.length() > u.length()) {
    //     System.out.println(s + t + " is a longer string than " + u); 
    // }
    // else if (s.length() + t.length() == u.length()) { 
    //     System.out.println(s + t + " is the same length as " + u);
    // }
    // else {
    //     System.out.println(s + t + " is shorter than " + u); 
    // }
    }
  }
  
