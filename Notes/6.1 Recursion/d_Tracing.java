public class d_Tracing
{
    public static void main(String[] args)
    {
    /*
    One of the most important skills with recursion is being able to 
    trace through a recursive method by hand. On the AP exam, you will
    be given recursive methods and asked to determine their output.

    The trick is to track each call carefully and show your work. 
    When a method calls itself, that new call has to FINISH before
    the original call can continue.

    Let's practice.
    */
   
    }

    public static int mystery1(int n)
    {
        if (n == 0)
        {
            return 2;
        }
        else if (n == 1)
        {
            return 1;
        }
        else
        {
            return mystery1(n - 1) + mystery1(n - 2);
        }
    }

    public static String mystery2(String s, int index)
    {
        if (index >= s.length())
        {
            return "";
        }
        else if (index % 2 == 0)
        {
            return s.charAt(index) + mystery2(s, index + 1);
        }
        else
        {
            return mystery2(s, index + 1);
        }
    }
}