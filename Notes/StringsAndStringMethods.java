/*
Notes Outline:
0) Review of Lab 1
1) Strings: a "new" kind of variable
2) String methods
3) Practice
4) Lab 3 Introduction
*/

/*
0) Review of Lab 1

- How do we feel about the examples?
- How might we check our work in the future? 

*/
public class StringsAndStringMethods {
    public static void main(String[] args)
    {
    /*
    1) Strings 

    Definition: A String is a collection (or String) of characters. 
    Strings can be stored as variables, or denoted with " ". 

    Index: Since strings can contain multiple characters, we say "index"
    to denote the location of particular characters in a particular string.
    Note that indices start at 0, not 1. 
    

    (0) (1) (2) (3) (4)
     h   e   l   l   o

    Examples:
    */

    // String s = "This is a string";
    // String t = "t";
    // String u = "";
    // System.out.println(s + t + u);

    /*
    1.5) Characters
    
    Definition: Characters are like strings, but with only one character.
    We use '' instead of "" to indicate characters.

    Examples: 
    */

    // char c = 'e';
    // char d = 'g';

    // System.out.println(c + d);
    // System.out.println(c + "" + d);

    /*
    2) String methods 

    - charAt()
    - indexOf()
    - length()
    - substring()
    - equals()
    - replace() and replaceAll()
    */

    String test = "Computer Science";
    // char a = test.charAt(5);
    // System.out.println(a);

    // int index = test.indexOf("Sci");
    // System.out.println(index);

    // int l = test.length(); 
    // System.out.println(l);

    // String sub1 = test.substring(5);
    // String sub2 = test.substring(0,5);
    // String sub3 = test.substring(5,6);
    // System.out.println(sub1);
    // System.out.println(sub2);
    // System.out.println(sub3);

    // System.out.println("Computer Science".equals(test));
    // System.out.println(test.equals("Computer Science"));

    // String new_test = test.replace("c","C");
    // System.out.println(new_test);
    /*
    3) Practice

    Problem 0) Write a computer program that prints out the first
    and last characters of a String.

    Problem 1) Write a computer program that combines two Strings,
    prints the result out, and also prints the sums of the lengths
    of the Strings
    */
    }
  }