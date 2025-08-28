public class d_Substring
{
    /*
    We've talked about Strings and a few methods related to 
    the position of particular characters in a String. 

    But what if you wanted to get a slice or subset of a String? 
    StringName.substring(start, end) is an extremely powerful method. 

    If we have a String s, then:

    s.substring(start, end) outputs a new String
    with characters in indices the interval [start, end) 
    */
    public static void main(String[] args)
    {
    String s = "sample";
    String t = s.substring(0, 3);
    System.out.println("Substring t includes characters in indices 0, 1, and 2");
    System.out.println("t: " + t);
    // String u = s.substring(1, 4);
    // System.out.println("Substring u includes characters in indices 1, 2, and 3");
    // System.out.println("u: " + u);  
    
    /*
    Sometimes, we use .substring() with only one input.
    Then, it looks like: 

    StringName.substring(start)

    and the substring goes on to the end of the StringName
    */

    // String a = "bagel";
    // String b = a.substring(2);
    // System.out.println("b starts at index 2 and goes until a ends");
    // System.out.println("b is: " + b);

    /*
    Q: If you forgot that you could use substring with only one input,
    how could you create a substring of some String s that:

    started at index 1 and went to the end of s? 
    */
    }
}