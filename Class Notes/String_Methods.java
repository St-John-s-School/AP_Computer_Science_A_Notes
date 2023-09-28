public class String_Methods
{
  public static void main(String[] args)
  {
    /* 
    APIs
    
    As the number of methods we know about increases, we need ways to organize collections of methods.
    Enter APIs! APIs (Application Programming Interfaces) are collections of methods and other code
    that present information on those methods in an organized way. 
    Importantly, APIs are programmer-friendly because they give context and important information
    for a lot of methods all in one place.

    A common analogy for APIs are menus at a restaurant. 
    Menus tell you what foods are available, the names of those foods,
    and what ingredients go into that food. However, they don't tell you how to cook it.

    APIs tell a programmer what methods are available, the names of those methods,
    and what happens in that method, but does not actually show you the implementation.
    
    */

    /*
    The String methods API

    We have a lot of String methods at this point.
    A table of useful String methods can be found in Chapter 3.3 of our textbook
    This table has method names, examples of calling these methods, and descriptions.
    This table is an API!
    
    */

    /*

    More String Methods

    We are going to introduce a few more String Methods today. 
    We are going to go over them formally, and show some examples, 
    but in the future the expectation is just that everyone reads the API
    and thus knows how and when to use each method.

    Before we introduce any methods, notice that none of our String methods 
    are static. That is, they all "belong" to a String and follow the 
    stringname.methodname() formatting. 

    */

    /*
    String str = "Hello";
    String capStr = s.toUpperCase();
    String lowStr = str.toLowerCase();
    System.out.println(str);
    System.out.println(capStr);
    System.out.println(lowStr);
    */

    /*
    String str = "Hello";
    String test1 = "l";
    String test2 = "z";
    int index1 = str.indexOf(test1);
    int index2 = str.indexOf(test2);
    System.out.println("The index of " + test1 + " is: " + index1); 
    System.out.println("The index of " + test2 + " is: " + index2); 
    */

    /*
    String larger = "Mr. Bounds";
    String smaller = "Bounds";

    if (larger.contains(smaller))
    {
      System.out.println(larger + " contains " + smaller);
    }

    else
    {
      System.out.println(larger + " does not contain " + smaller);
    }
    */

    /*
    String first = "Gwendolyn";
    String second = "Gwendolyn";

    if (first == second)
    {
      System.out.println(first + " and " + second + " are the same);
    }

    else if (first.equals(second))
    {
      System.out.println(first + " and " + second + " are the same but
      we can't use == to check equality of Strings);
    }

    else
    {
      System.out.println(first + " and " + second + " are not the same);
    }
    */

    /*
    String alpha = "Architecture";
    String beta = "Brazil";

    System.out.println(alpha.compareTo(beta));
    System.out.println(beta.compareTo(alpha));
    */

    /* 
    Learning how to use methods

    Above are examples of a lot of new String methods. 
    Generally, the best way to learn how new methods work 
    is just to play around with them.

    We have tools like Scanner that allow us to call methods
    with a variety of inputs. Even though we know how methods
    should work because we have APIs, sometimes just calling 
    methods and seeing what happens is the best way to learn. 
    */
    
  }
  
}
