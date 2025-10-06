import java.util.Scanner;
import java.awt.Point;

    /*
    Objects come with data (variables) and methods.
    To use an object well, we need to know
    more about them. 

    The documentation (instructions) showing how to use an Object
    are called an API. 

    Consider the Point Object API: 
    https://docs.oracle.com/javase/8/docs/api/java/awt/Point.html

    What field variables (name for variables that make up an Object) are there?

    What methods are there?

    */

public class b_APIs
{
    public static void main(String[] args)
    {
        Point p = new Point(4,5);
        p.translate(2, 1);
        System.out.println(p);
    }
}