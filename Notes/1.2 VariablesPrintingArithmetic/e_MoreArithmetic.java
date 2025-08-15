public class e_MoreArithmetic
    {
    public static void main(String[] args)
        {
        /*
        Operators:
        +, -, *, /, %, = 
        
        We need to talk about /.
        Division in Java is peculiar. When we divide ints, division always produces
        an int. We know mathematically that this isn't true, but this is just how it works.
        Java makes the quotient an int by ignoring the remainder.

        If you want to know the remainder of division, you should use %. 
        */
        
        System.out.println("--------------------");

        int quotient = 7 / 3;
        System.out.println("The quotient is: " + quotient); 

        int remainder = 7 % 3;
        System.out.println("The remainder is: " + remainder); 

    }
}