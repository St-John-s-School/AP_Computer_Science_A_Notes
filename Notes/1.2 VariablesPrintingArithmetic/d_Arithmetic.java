public class d_Arithmetic
    {
    public static void main(String[] args)
        {
        /*
        Arithmetic in Java works basically the same as in real life,
        with only a few exceptions. 

        We do arithmetic with operators. They are interpreted by your computer
        as mathematical operators. 
        
        Operators:
        +, -, *, /, %, = 
        
        The first thing we need to know is the "=" operator. This is NOT
        an equals sign. It is the assignment operator,
        and it gives the value on the right side of the equal sign
        to the variable on the left. 

        As you can see in the examples below, we can add with +.
        */
        System.out.println("--------------------");

        int sum = 5 + 7;
        System.out.println("We can add integers. The sum is: " + sum); 

        double result = 5.5 + 6.2;
        System.out.println("We can add doubles. The result is: " + result); 

        /*
        As shown previously, we can also use the assignment operator to change
        the value of a variable.

        Notice that if we have already declared the variable, we don't need to say
        the type again. Java remembers what type it is.
        */

        // sum = 14;
        // System.out.println("The new value of sum is:" + sum);
    }
}
