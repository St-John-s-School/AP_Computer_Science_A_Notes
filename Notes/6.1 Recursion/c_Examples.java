public class c_MoreExamples
{
    public static void main(String[] args)
    {
    /*
    Now that we know the anatomy of a recursive method,
    let's write a few more. For each one, we need to identify:
    1) What is the base case?
    2) What is the recursive case?
    3) How does the recursive case get CLOSER to the base case?
    */

    /*
    Example: Exponents

    We know that 2^5 = 2 * 2 * 2 * 2 * 2.
    But we can also say 2^5 = 2 * 2^4.
    */

    System.out.println("power(2, 5) = " + power(2, 5));

    /*
    Example: Counting chars in a String

    How many times does 'a' appear in "abracadabra"?

    We can think of it this way:
    - Look at the first character. Is it 'a'? If yes, that's 1.
    - Then, count how many 'a's are in the REST of the String.
    */

    // System.out.println("countChar('abracadabra', 'a') = " + countChar("abracadabra", 'a'));
    }

    public static int power(int a, int b)
    {

    }

    public static int countChar(String s, char c)
    {
    
    }
}