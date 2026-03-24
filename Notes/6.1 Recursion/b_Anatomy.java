public class b_Anatomy
{
    /*
    It turns out that every recursive method has two parts:

    1) The base case:

    This is the part of the method where the 
    simplest version of the method is defined.
    We can think of this as what stops
    the recursion. 

    2) The recursive step

    This is the part of the method where the
    method calls a simpler version of itself. 

    A recursive method MUST have these two parts.
    If it doesn't have the base case, it will never end.

    If it doesn't have the recursive step, it won't be recursive. 

    None of the methods we have written this year have been recursive.
    They've probably called other methods, but they haven't called
    themselves. 

    Q: Why might finding the sum of the digits in a number
    be recursive? What is our base case? What is the recursive step? 

    Let's program digitSum() together.
    */
    public static void main(String[] args)
    {
    System.out.println(digitSum(1452));
    }

    public static int digitSum(int num)
    {
        
    }
}