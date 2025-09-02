public class h_ComplexConditionals
{
/*
We've learned a few ways to run code based on a condition.
What if the code we want to run is based on another condition?
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

}