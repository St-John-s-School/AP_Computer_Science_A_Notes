public class g_ComplexConditionals
{
/*
Notice that the body of any conditional is inside brackets
if (condition)
{
    //stuff
}

We also have brackets to represent where we write code, and we'll have brackets
for other reasons later.

This means that to make our code readable (for a human) we need to indent wisely.

Rule of thumb: If we want any code to run based on something else,
it must go in brackets and be indented. 

We also usually put each bracket on its own line in the program. 
*/
    public static void main(String[] args)
    {
        System.out.println("---------------------\n");
        int age = 17;
        boolean hasLicense = true;
        if (age >= 16)
        {
        if (hasLicense)
        {
        System.out.println("You can drive!");
        }
        else
        {
        System.out.println("You need your license to drive!");
        }
        }
        else 
        {
        System.out.println("You're too young to drive on your own!");
        }
        System.out.println("\n---------------------");
    }

    /*
    Q: Who thinks the above example is hard to read? What is the body of what conditional?
    */

}