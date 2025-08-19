public class c_RandomNumbers
{
    public static void main(String[] args)
    {
        /*
        Sometimes we want our programs to be random, like in games or a lottery.
        Math.random() is a method that generates a random double
        between 0.0 and 1.0 (including 0.0 but not including 1.0).

        But what if we want random numbers in a different range?

        How do we get a random double between 0 and x? 

        How do we get a random double between a and b?
        */

        System.out.println("--------------------");

        // Basic random number between 0.0 and 1.0
        double basicRandom = Math.random();
        System.out.println("Random number between 0 and 1: " + basicRandom);

        // Random number between 0 and 10
        // double randomUpTo10 = Math.random() * 10;
        // System.out.println("Random number between 0 and 10: " + randomUpTo10);

        // Random number between 5 and 15
        // double randomBetween5And15 = Math.random() * 10 + 5;
        // System.out.println("Random number between 5 and 15: " + randomBetween5And15);
        /*
        Q: How would you make a random integer between 1 and 6 (like a die)?
        */
    }
}