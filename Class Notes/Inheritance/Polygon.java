import java.awt.*;
import java.util.Scanner;


/*
 * This is the parent class that are other shapes will inherit form.
 * 
 * This allows us to share properites and functionality while adding on
 * new information that only applies to an inherited class.
 */

public class Polygon
{
    private int sides;
    private Point[] vertices;
    private double[] sideLengths;

    public Polygon(int sides)
    {
        this.sides = sides;
        vertices = new Point[sides];
        sideLengths = new double[sides];

        addVertices();
        calculateSideLengths();
    }

    private void calculateSideLengths()
    {
        for(int i = 0; i < sides-1; i++)
        {
            sideLengths[i] = distance(vertices[i].x, vertices[i].y,vertices[i+1].x, vertices[i+1].y);
        }

        sideLengths[sides-1] = distance(vertices[sides-1].x, vertices[sides-1].y,vertices[0].x, vertices[0].y);
    }

    private void addVertices()
    {
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < sides; i++)
        {
            vertices[i] = new Point();
            System.out.println("Please enter vertex " + (i+1) + ": ");
            System.out.print("X: ");
            vertices[i].x = in.nextInt();
            System.out.print("Y: ");
            vertices[i].y = in.nextInt();
        }
    }

    
    public double perimeter()
    {
        double output = 0.0;
        for(int i = 0; i < sideLengths.length; i++)
        {
            output += sideLengths[i];
        }
        return output;
    }

    // Since we don't know what kind of shape the polygon is we don't have a 
    // good way at calculating the area of it.
    public double area()
    {
       return 0.0;
    }

    private double distance(int x1, int y1, int x2, int y2)
    {
        return Math.sqrt( (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) );
    }

    // The @Override tells the Java compiler that the following
    // method will be overriding a method that is in a parent class.
    // The toString() is overriden from the Object class and can be used
    // directly in a print to print the String it returns.
    @Override
    public String toString()
    {
        String output = "";
        output += "I am a polygon\n";
        output += "My area is: " + area() + "\n";
        output += "My perimeter is: " + perimeter() + "\n";

        return output;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public Point[] getVertices() {
        return vertices;
    }

    public void setVertices(Point[] vertices) {
        this.vertices = vertices;
    }

    public double[] getSideLengths() {
        return sideLengths;
    }

    public void setSideLengths(double[] sideLengths) {
        this.sideLengths = sideLengths;
    }
}
