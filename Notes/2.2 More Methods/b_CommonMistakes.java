public class b_CommonMistakes
{
    public static boolean isEven(int a)
    {
        if (a % 2 == 0)
        {
            return true;
        }
        
    }

    public static void main(String[] args)
    {
      /*
      Let's review some common mistakes made when writing methods
      The first is related to returning values. 

      Consider the method above. What is the issue if a is odd? 

      What are we promising our computer that our method will ALWAYS return?
      */

    System.out.println("---------------------\n");

    // Will give an error
    System.out.println(isEven(14));

    System.out.println("\n---------------------");        

    /*
    Now consider the following example. 
    What is the error that will happen when we run the code below?
    */


    System.out.println("---------------------\n");
    int num = 5;
    cube(num);
    System.out.prinlnt(c);
    System.out.println("\n---------------------");        


    /*
    Finally, consider the calculateGrade() method below.
    What is the issue with it?

    What happens to a method after it returns something?
    */
    }

    // public static int cube(int b)
    // {
    //     int c = b * b * b;
    //     return c;
    // }

    public static String printGrade(int grade)
    {
        if (grade >= 90)
        {
            return "A";
            System.out.println("Great job!");
        }
        else if (grade >= 80)
        {
            return "B";
            System.out.println("Good job");
        }
        else 
        {
            return "C";
            System.out.println("Keep studying...");
        }
    }
}