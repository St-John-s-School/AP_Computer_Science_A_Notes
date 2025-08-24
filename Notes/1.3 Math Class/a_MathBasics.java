public class a_MathBasics
{
    public static void main(String[] args)
    {
        /*
        So far, we've learned basic arithmetic: +, -, *, /, %
        But what if we want to do more complex math? Like finding the square root
        of a number, or generating random numbers?

        Java provides a built-in "Math class" that contains many useful
        mathematical functions. A "class" is a collection of methods, and
        a method is a command that does a specific thing.
        We only really know one method so far, which is println. 
        println() is the method that prints things. 

        To use a Math method, we write: Math.methodName(input)
        The Math method have outputs that we can store in variables. 
        The output of a method is also known as its "return" value. 

        Let's start with some basic Math method:
        */
        System.out.println("--------------------");

        // Math.abs() gives us the absolute value (distance from zero)
        int negative = -7;
        int absolute = Math.abs(negative);
        System.out.println("The absolute value of " + negative + " is " + absolute);

        /*
        Math.max() tells us which of two numbers is larger.
        Math.max() is unique in that it has two inputs.
        */
        // int a = 12;
        // int b = 8;
        // int larger = Math.max(a, b);
        // System.out.println("The larger of " + a + " and " + b + " is " + larger);

        /*
        Math.min() tells us which of two numbers is smaller.
        For either max() or min(), if the two inputs are the same
        It will just print either one.
        */ 

        // double x = 3.7;
        // double y = 3.2;
        // double smaller = Math.min(x, y);
        // System.out.println("The smaller of " + x + " and " + y + " is " + smaller);

        /*
        Notice that Math functions work with both ints and doubles.
        It even works with one int and one double. 
        The Math class is very useful - we'll be using it a lot in our lab problems!
        */
        
    }
}