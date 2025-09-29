public class a_Review
{
/*
The only real "new" thing we will discuss
in this set of notes is overloading.

Overloaded methods have the same name,
but different parameters. 

Java automatically knows which one to use
based on the values passed in as parameters.
*/

    public static int add (int a, int b)
    {
        return a + b;
    }

    public static String add(String a, String b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {

        System.out.println("---------------------\n");

        System.out.println(add(14, 15));

        // System.out.println(add("14", "15"));

        System.out.println("\n---------------------");                   
    }
}