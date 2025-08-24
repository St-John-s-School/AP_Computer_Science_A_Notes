public class e_Composition
{
    public static void main(String[] args)
    {
        /*        
        Just like we can combine arithmetic operations, we can combine Math methods.
        We can use the result of one Math method as input to another, or combine 
        them in the same expression. This is often called composition. 

        Those of you in A2A or further math courses might think of how functions
        can be composed. When you see f(g(x)), you understand that g(x) is the
        input into the function f. The methods are chained so that the output of one
        is the input into another. 

        NOTE: In the order of operations, methods go before arithmetic operators. 
        */
        System.out.println("--------------------");

        // Using multiple Math methods in sequence
        int x = 2;
        double mystery = Math.round(Math.sqrt(x));
        
        System.out.println("Initial value of x: " + x);
        System.out.println("Square root of x: " + Math.sqrt(x));
        System.out.println("Rounded (final) value: " + mystery);  

        // Q: What's going on here? 
        // int x1 = 3;
        // int y1 = 0;
        // int x2 = 6;
        // int y2 = 4;
        
        // double mystery = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        /*
        When reading complex expressions, work from the inside out.

        Q: What does Math.max(Math.abs(-5), Math.abs(-3)) evaluate to?

        Q: While method composition is useful,
        does everything need to be done on one line?
        */
    }
}