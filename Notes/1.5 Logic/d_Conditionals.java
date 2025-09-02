public class d_Conditionals
{
/*
Great! Amazing! Incredible!
We now know so many ways to calculate whether
something is true or false.

But what if we want our computer to do something
based on whether another statement is true or false?

We write a conditional statement:

The most basic conditional statement is this:

if (logical statement)
{
// do something
}

We call this an "if" statement, because
the body (inside the brackets) will happen
"if" the logical statement (condition) is true.

NOTE: Think of conditional statements as a way 
to get your computer to run some code, but only 
if something else (the condition) is true. 
*/
    public static void main(String[] args)
    {
        System.out.println("---------------------\n");
        int age = 27;
        if (age >= 18)
            {
                System.out.println("You can vote!");
            }
        System.out.println("\n---------------------");

        System.out.println("---------------------\n");

        // String password = "3kjfa95tmmdfl!@ee";
        // if (password.length() > 8)
        //     {
        //         System.out.println("You have a strong password!");
        //     }
        // System.out.println("\n---------------------");
    }
    /*
    Q: Consider the examples above,
    What happens if you are younger than 18?
    What happens if you have a short password?
    */
}