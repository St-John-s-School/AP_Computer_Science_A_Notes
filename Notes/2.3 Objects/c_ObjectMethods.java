import java.util.Scanner;
import java.awt.Point;

    /*
    Objects usually come with two kinds of methods. 
    These methods can be used by writing:

    objectname.methodname(); 

    1) accessors

    These methods are methods that return data related to the Object.
    Usually these return the values of field variables

    2) mutators

    These methods change the values of the field variables.
    NOTE: This is the ONLY way to actually modify the Object. 

    For the Point Object, which methods are accessors, which are mutators? 

    */

public class c_ObjectMethods
{
    public static void main(String[] args)
    {
        Point p = new Point(4,5);
        p.translate(2, 1);
        System.out.println(p);
    }
}