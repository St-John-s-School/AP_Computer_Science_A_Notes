import java.util.Scanner;
import java.awt.Point;

    /*
    We need to distinguish methods that belong to Objects
    with methods that use Objects.

    translate() is an example of a method that every 
    Point object comes with.

    We can write our own methods that use Point objects, though. 

    As practice, write a method that calculates the distance from one Point object to another.

    What parameters should this method have?

    What data should it return?

    */

public class d_MethodsUsingObjects
{
    public static void main(String[] args)
    {
        Point p = new Point(4,5);
        p.translate(2, 1);
        System.out.println(p);
    }
}