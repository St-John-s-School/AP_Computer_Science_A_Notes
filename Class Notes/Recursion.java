/*
    Recursion is an alternate form of looping that utilizes a method.
    This is achieved by a method calling itself until some condition has been met.

    Every recursive method has a set of properties that need to be met:
        1. The method should have a parameter or external component that is changing 
        2. A stop condition that typically looks toward the parameter or external component that is changing

    Let's look at some examples of how an Iterative implementation might look like as a Recursive one
*/

public class Recursion {
   
    // An iterative implementation of multiplication 
    public static int multiplicationIter(int multiplicand, int multiplier)
    {
        int result = 0;
        for(int i = 0; i < multiplier; i++)
        {
            result += multiplicand;
        }
        return result;
    }

    // A recursive implementation of multiplication 
    public static int multiplicationRec(int multiplicand, int multiplier)
    {
        if(multiplier == 0)
            return 0;
        return multiplicationRec(multiplicand, multiplier-1) + multiplicand;
    }
    // Both multiplication implementations approach the problem in the same way 
    // which is to add the multiplicand to itself a multiplier amount of times

    
    // An iterative implementation of division 
    public static int divisionIter(int dividend, int divisor)
    {
        int result = 0;
        while (dividend >= divisor)
        {
            dividend -= divisor;
            result++;
        }
        return result;
    }

    // A recursive implementation of division 
    public static int divisionRec(int dividend, int divisor)
    {
        if(dividend < divisor)
            return 1;
        return divisionRec(dividend - divisor, divisor )+ 1;
    }
    // Both division implementations approach the problem in the same way 
    // which is to count the number of times we can subtract the divisor from the dividend
    

    // An iterative implementation of factorial
    public static int factIter(int n)
    {
        int result = 1;

        for(int i = n; i > 0; i--)
        {
            result *= i;
        }
        return result;
    }

    // A recursive implementation of factorial
    public static int factRec(int n)
    {
        if( n == 0)
            return 1;

        return factRec(n - 1) * n;
    }
    // Both factorial implementations approach the problem in the same way 
    // which is to multiply the starting number by each of the subsequent numbers proceeding it
    

    // An iterative implementation of the nth number in the Fibonacci sequence
    public static int fibIter(int n)
    {
        if (n < 2)
            return n;
        
        int ans = 0;
        int n1 = 0;
        int n2 = 1;
        for(; n > 0; n--)
        {
            ans = n1 + n2;
            n1 = n2;
            n2 = ans;
        }
        return ans;
    }
    // This approach is done in a straightforward manner utilizing the starting points of n1 and n2 of the sequence 
    // then combines them to generate the next number in the sequence
    // then moves the n1 and n2 variables to the next two numbers in the sequence until we reach the target number

    // A recursive implementation of the nth number in the Fibonacci sequence
    public static int fibRec(int n)
    {
        if(n <= 1)
            return 1;

        return fibRec(n-1) + fibRec(n-2);
    }
    // This approach works from a top-down perspective by counting the number of times 
    // the starting number can be broken down until it reaches the starting point of the sequence
    // this will count will give us the next number in the sequence

    

    public static void main(String[] args) 
    {
        System.out.println(multiplicationIter(4,3));
        System.out.println(multiplicationRec(4,3));

        System.out.println(divisionIter(7,2));
        System.out.println(divisionRec(7,2));
        
        System.out.println(factIter(5));
        System.out.println(factRec(5));

        System.out.println(fibIter(5));
        System.out.println(fibRec(5));
    }
}
