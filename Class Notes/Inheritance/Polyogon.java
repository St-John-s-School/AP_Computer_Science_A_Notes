import java.awt.*;
import java.util.Scanner;

public class Polygon
{
// Make sure to point out that private variables/methods can’t be accessed outside of Polygon even if the class inherits from it.
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
        // Implemented by students
    }

    public double area()
    {
       // Implemented by students
    }

    private double distance(int x1, int y1, int x2, int y2)
    {
        return Math.sqrt( (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) );
    }

    public void print()
    {
        System.out.println("I am a polygon");
        System.out.println("My area is: " + area());
        System.out.println("My perimeter is: " + perimeter());
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
