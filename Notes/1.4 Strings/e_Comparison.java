public class e_Comparison
{
    /*
    We have a few methods that will help us compare Strings. 
    */
    
    public static void main(String[] args)
    {
    /*
    First, we have StringName.equals(otherString)

    .equals() outputs either True or False, depending on whether the two Strings
    are equal to one another.
    */

    String a = "hello";
    String b = "Hello";
    System.out.println(a.equals(b));
    System.out.println(b.equals(a));

    /*
    We also have StringName.contains(otherString).
    .contains() returns True if StringName contains otherString. 
    */
        
    // String larger = "bananas";
    // String smaller = "banana";

    // System.out.println(larger.contains(smaller));

    /*
    Notice that we can use .contains() to check whether Strings
    have particular characters
    */

    // String test = "bananas";
    // System.out.println(test.contains("e"));
    }
}