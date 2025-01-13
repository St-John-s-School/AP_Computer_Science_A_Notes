import java.util.*; // for ArrayList

public class ForEachLoops
{
  public static void main(String[] args)
  {

    /*
    Consider an ArrayList, "list", of Strings. 
    What does this loop do to that ArrayList? 
    */

    /*
    ArrayList<String> list = new ArrayList<>();
    list.add("Frank");
    list.add("Dennis");
    list.add("Dee");
    list.add("Charlie");
    list.add("Mac");

    int sum = 0;
    for (int i = 0; i < list.size(); i++) {
     String s = list.get(i);
     sum += s.length();
     // Alternatively, sum += list.get(i).length();
    }






    System.out.println("Total of lengths = " + sum);
    */

    /*
    Using a for-each loop, we can re-write the above code as follows:
    */

    /*
    int sum = 0;
    for (String s: list) {
     sum += s.length();
    }
    System.out.println("Total of lengths = " + sum);
    */

    /*
    The way a for-each loop works, we are basically saying:
    "for each String "s" contained in the ArrayList "list" "
    Do the body of the loop. 

    The advantage is that the object we care about,
    String s, has already been specified and given a name (s)
    compared to the for loop where we need to increment and use the .get() method
    on the variable i to find the right String.

    We generally use the for-each loop
    whenever we want to do exactly one thing to each element of a list, in order.
    IMPORTANT NOTICE: you cannot use a for-each loop if you are modifying
    the ArrayList inside the loop. You can't use the for-each loop 
    if you want to re-order, remove, skip, or add elements.
    Notice in the above example we're just adding to a completely unrelated variable. 
    The general structure of the for-each loop is given below: 

    for (<type> <name>: <structure>) {
     <statement>;
     <statement>;
     ...
     <statement>;
    }
    */

    /*

    1) Consider the ArrayList representing the integers [1, 3, 5, 7, 9, 11, 13]
    a) Declare and initialize this ArrayList.
    b) Using a for loop, print whether each number is divisible by 3. 
    c) Using a for-each loop, print whether each number is divisible by 3.
    
    2) Consider the ArrayList of Strings
    ["Anna", "Bob", "Caroline", "Dennis", "Edward", "Frankie"], 
    Using a for-each loop, add the Strings which end in a vowel
    to a new ArrayList of Strings.

    */
    }
}
