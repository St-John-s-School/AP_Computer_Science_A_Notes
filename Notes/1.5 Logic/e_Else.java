public class e_Else
{
/*
What if we want our program to do something
if something is true, and something else otherwise?
Currently, nothing happens if our condition is false

We can write an if-else statement!

if (condition)
{
    // do something
}

// only happens if condition is false
else
{
    // do something else
}

NOTE: An else doesn't need a condition. Why? 
Because it always happens when the if condition is false.
*/
    public static void main(String[] args)
    {
        System.out.println("---------------------\n");
        double temperature = 102.1;
        if (temperature > 99)
        {
            System.out.println("Don't come to school!");
        }
        else
        {
            System.out.println("Come to school!");
        }
        System.out.println("\n---------------------");

        // System.out.println("---------------------\n");
        // int number = 8;
        // if (number % 2 == 0)
        // {
        //     System.out.println(number + " is even");
        // }
        // else
        // {
        //     System.out.println(number + " is odd");
        // }   
        // System.out.println("\n---------------------");
 
        /*
        Q: Could we write the above code without an else?
        Q: Why might it be better to use else than two ifs?
        */
    }
}