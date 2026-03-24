public class a_Definition
{
    /*


    In this unit, we will focus on everything that
    is on the AP exam but we haven't talked about
    already this year.

    Thankfully, it's pretty short.

    The first major topic we have is recursion.

    There was once a mathematician whose name was 
    Benoit B. Mandelbrot. The B in his middle name stood for:
    Benoit B. Mandelbrot! 

    Ok, this joke probably doesn't make sense to you.

    How about this? You're on spring break, and the line
    for security at the airport is really long!

    It's so long that you can't see the front. So what you do is this:
    First, you ask the person in front of you 
    "how many people are in front of you?".

    They ask the person in front of them, and so on.
    Until we get to the person in front. 

    That person at the very front can then say 
    "Zero", and the person behind them says "One"
    and eventually all the answers cascade back to you
    and you learn you're the 900th person in line. 

    A recursive method is a method that,
    in the body, calls itself. It does this
    to break the problem down into smaller 
    subproblems.

    Consider the factorial method below.
    Try to run it by hand. 

    */
    public static void main(String[] args)
    {
    System.out.println(factorial(4));

    }

    public static int factorial(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        else
        {
            return n * factorial(n - 1);
        }
    }
    /*
        factorial(4)
        -> returns 4 * factorial(3)
                        -> returns 3 * factorial(2)
                                        -> returns 2 * factorial(1)
                                                        -> returns 1  (base case!)
                                        -> returns 2 * 1 = 2
                        -> returns 3 * 2 = 6
        -> returns 4 * 6 = 24
        */
}