public class d_Rounding
{
    public static void main(String[] args)
    {
        /*
        We learned previously that we can always convert from a double to an int
        by casting it. This basically just ignored what comes after the decimal.

        The Math class has a few methods that do this conversion in other ways. 

        Math.floor(number) - rounds DOWN to the nearest integer
        Math.ceil(number) - rounds UP to the nearest integer  
        Math.round(number) - rounds to the NEAREST integer (standard rounding rules)

        */
        System.out.println("--------------------");

        double testNumber = 4.7;
        System.out.println("Starting with the number: " + testNumber);
        
        // Different ways to get an integer
        System.out.println("Math.floor(" + testNumber + ") = " + Math.floor(testNumber));
        System.out.println("Math.ceil(" + testNumber + ") = " + Math.ceil(testNumber));
        System.out.println("Math.round(" + testNumber + ") = " + Math.round(testNumber));
        System.out.println("(int)" + testNumber + " = " + (int)testNumber);

        System.out.println();

        // Let's try with a negative number
        // double negativeNumber = -2.3;
        // System.out.println("With a negative number: " + negativeNumber);
        // System.out.println("Math.floor(" + negativeNumber + ") = " + Math.floor(negativeNumber));
        // System.out.println("Math.ceil(" + negativeNumber + ") = " + Math.ceil(negativeNumber));
        // System.out.println("Math.round(" + negativeNumber + ") = " + Math.round(negativeNumber));
        // System.out.println("(int)" + negativeNumber + " = " + (int)negativeNumber);

        /*
        Q: What is the difference between floor() and int()? It's subtle. 
        Q: What do the floor(), ceil(), and round() methods output? 
        */
    }
}