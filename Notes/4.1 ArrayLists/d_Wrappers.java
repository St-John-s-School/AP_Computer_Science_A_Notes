import java.util.*;

public class d_Wrappers
{
    public static void main(String[] args)
    {
    /*
    One restriction we placed on ArrayLists is that
    their elements have to be Objects.

    But what about ints or doubles? They aren't Objects?
    Can we not have ArrayLists of Numbers?

    We can use what Java calls a "Wrapper". It turns out that
    there are Object versions of all the primitive data types.

    int -> Integer
    double -> Double
    char -> Character
    boolean -> Boolean

    Each of these Objects works exactly the same as the original.
    It's just that they have different names because they're Objects now.
    */

    // int x = 38;
    // Integer y = 38;
    // System.out.println(x);
    // System.out.println(y);

    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++)
    {
        list.add(i);
    }
    System.out.println(list);

    /*
    Notice that we can add ints to our ArrayList of Integers with no problem.
    The ONLY time we need to remember Integer vs int is when we declare
    the ArrayList. From that point on, we can use ints. 
    */

    }
}