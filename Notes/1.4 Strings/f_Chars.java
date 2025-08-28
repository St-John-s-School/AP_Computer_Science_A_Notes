public class f_Chars
{
    /*
    It turns out that the characters that make up Strings are also a data type.
    Are we ok with a data type that is made of other data types? 

    Each individual character in a String is called a char.
    We can tell Java it's dealing with a char by using ' ' (single quotes).

    Ex: char c = 'a';

    For the most part, chars can be treated as single character Strings.
    */

    public static void main(String[] args)
    {
    /*
    There is really just one wrinkle when it comes to chars. 
    Java is picky about types of variables, and 
    charAt() outputs a char, not a String.

    So, the code below will give an error. 
    */

    String s = "hello";
    String t = s.charAt(2);

    /*
    To fix it, we need to cast the char into a String.
    */

    // String s = "hello";
    // String t = s.charAt(2) + "";    
    // System.out.println(t);

    /*
    It turns out that the sum (concatenation) of a char
    and a String is a String.
    */
    }
}