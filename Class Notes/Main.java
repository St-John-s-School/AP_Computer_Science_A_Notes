public class Main {

    public static int multiplicationIter(int first, int second)
    {
        int result = 0;
        for(int i = 0; i < second; i++)
        {
            result += first;
        }
        return result;
    }

    public static int multiplicationRec(int first, int second)
    {
        if(second == 0)
            return 0;
        return multiplicationRec(first, second-1) + first;
    }

    public static int fibRec(int n)
    {
        if(n <= 1)
            return 1;

        return fibRec(n-1) + fibRec(n-2);
    }

    public static int divisionIter(int dividend, int divisor)
    {
        //  7/2
        int result = 0;
        while (dividend >= divisor)
        {
            dividend -= divisor;
            result++;
        }
        return result;
    }

    public static int divisionRec(int dividend, int divisor)
    {
        if(dividend < divisor)
            return 1;
        return divisionRec(dividend - divisor, divisor )+ 1;
    }

    public static int factIter(int n)
    {
        int result = 1;

        for(int i = n; i > 0; i--)
        {
            result *= i;
        }
        return result;
    }

    public static int factRec(int n )
    {
        if( n == 0)
            return 1;

        return factRec(n - 1) * n;
    }

    public static int summationIter(int num)
    {
        int sum = 0;
        for(int i = 1; i <= num; i++)
        {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {

       // System.out.println(multiplicationIter(4,3));
       // System.out.println(multiplicationRec(4,3));

        //System.out.println(fibRec(5));
        //System.out.println(divisionRec(7,2, 0));
        System.out.println(summationIter(100));


    }
}
