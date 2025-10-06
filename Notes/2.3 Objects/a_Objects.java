import java.util.Scanner;
import java.awt.Point;

    /*
    We have been working with various types of data this year.
    Today we are going to think about defining and using our own data types.

    Sometimes, we want to bundle together variables and methods that are 
    related to some core idea. For example, if we want to represent points
    on a coordinate grid, we want a variable for the x coordinate, 
    a variable for the y coordinate, and maybe some methods related to Points.

    We want all of those to be together so that we don't have to manually
    define them over and over if we had multiple Points. Also,
    it might make our code easier to read if we "bundled" all of this code together.

    That "bundle of code" is called an Object.
    
    You can think of an Object as the combination of 
    1) data (variables)
    2) methods

    Objects are different than variables because they're
    more complex (they can contain variables) and
    they have methods. We use capital letters 
    to represent Objects in Java.

    It turns out that Strings are examples of Objects.

    What "data" does a String object contain?
    What "methods" do String objects have?
    */

public class a_Objects
{
    public static void main(String[] args)
    {


    /*
    To make an Object, you need to use a special
    method called a constructor.

    The constructor always has the following syntax:
    new ObjectName(parameters);

    The constructor method returns the Object that has 
    just been made.

    Below are examples of Objects, 
    notice how they all use new 
    followed by Object type.
    */

    Scanner in = new Scanner(System.in);

    String s = new String("banana");

    Point p = new Point(5, 4);
    }

}