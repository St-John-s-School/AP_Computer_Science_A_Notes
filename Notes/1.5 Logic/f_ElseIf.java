public class f_ElseIf
{
/*
What if we want our program to choose one of many things?

We write an even more complex statement:

if (condition)
{
    // do something
}

else if (another condition)
{
    // do something else
}

// only happens if every previous condition is false
else
{
    // do something else
}

The computer will do exactly one of the multiple conditional statements.

One way to think about this is if the first if statement is true, then
neither the else if or else will happen.
If the "if" is false, then we check the "else if".
If the "else if" is true, we do it.
If the "else if is false, then we do the else.

Basically, "else if" becomes an "if" when the previous statements are false. 

NOTE: An else if needs a condition. Why? 
*/
    public static void main(String[] args)
    {
        System.out.println("---------------------\n");
        int day = 1;
        if (day == 1)
        {
            System.out.println("ACBDF");
        }
        else if (day == 2)
        {
            System.out.println("EGFBC");
        }
        else if (day == 3)
        {
            System.out.println("DAECG");
        }
        else if (day == 4)
        {
            System.out.println("EFBAD");
        }
        else if (day == 5)
        {
            System.out.println("GBCFA");
        }
        else if (day == 6)
        {
            System.out.println("CDBEG");
        }
        else
        //Q: Why no condition for the else. If we get to here in the code
        //   What must day be equal to?
        {
            System.out.println("FEAGD");
        }

        System.out.println("\n---------------------");
    }

    /*
    Q: Can we write this with multiple if statements? 
       What is the difference (if there is one)?
    */
}