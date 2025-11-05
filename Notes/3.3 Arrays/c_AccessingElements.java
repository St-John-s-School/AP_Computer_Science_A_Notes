import java.util.Scanner;

public class c_AccessingElements
{
    public static void main(String[] args)
    {
    /*
    Notice that we haven't initialized any of the elements in our array. 
    However, Java actually auto-initializes the elements to "default" values.
    
    To see what is currently in our array, we need a way to "get" a single element.

    We can access elements of an array by writing:
    <array_name>[<index>];    

    Note the use of [] in our syntax. Whenever you see [],
    understand that we are either making, or accessing, an array.
    */

    int[] ages = new int[12];
    System.out.println(ages[0]);
    System.out.println(ages[11]);

    /*
    Q: Well, we probably want ages to be values other than zero.
       How can we set the values of ages to what we want?  
    */

    // ages[6] = 16;
    // System.out.println(ages[6]);

    /*
    Q: How might we set EVERY value in an array to what we want?
    */

    // Scanner in = new Scanner(System.in);

    }
}