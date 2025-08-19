public class b_Exponents
{
    public static void main(String[] args)
    {
        /*
        Sometimes we need to raise a number to a power, or find a square root.
        Regular arithmetic operators can't do this for us.

        Math.pow(base, exponent) raises the base to the given power.
        For example: Math.pow(2, 3) calculates 2^3 = 8

        Math.sqrt(number) finds the square root of a number.
        For example: Math.sqrt(16) = 4 because 4 * 4 = 16
        */
        System.out.println("--------------------");

        // Using Math.pow() to calculate powers
        double base = 3;
        double exponent = 4;
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " = " + result);

        // Using Math.sqrt() to find square roots
        // double number = 25;
        // double squareRoot = Math.sqrt(number);
        // System.out.println("The square root of " + number + " is " + squareRoot);

        // Let's calculate the area of a square
        // double sideLength = 7;
        // double area = Math.pow(sideLength, 2);
        // System.out.println("A square with side length " + sideLength + " has area " + area);

        // And let's find the side length if we know the area
        // double knownArea = 49;
        // double calculatedSide = Math.sqrt(knownArea);
        // System.out.println("A square with area " + knownArea + " has side length " + calculatedSide);

        /*
        Q: Is Math.sqrt() really necessary? What can we use instead? 

        Q: What kind of variables do sqrt() and pow() output? 
        */
    }
}