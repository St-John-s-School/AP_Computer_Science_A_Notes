
// The extends key word signifies which class we would like to inherit.
// This creates an is-a relationship as Rectangle is-a Polygon
public class Rectangle extends Polygon
{
    public Rectangle()
    {
        // This is the super key word, it allows us to gain acess to our
        // parent class in this case it allows us to call the parent classes
        // constructor allowing us to not have to redo all of the code for a child. 
        super(4);
    }

    // The perimeter() and area() are overriden from the Polygon class
    // this lets us use a rectangles forumla for perimeter and area
    @Override
    public double perimeter()
    {
        double output = 0.0;

        output = (2.0 * getSideLengths()[0]) + (2.0 * getSideLengths()[1]);

        return output;
    }

    @Override
    public double area()
    {
        double output = 0.0;

        output = (getSideLengths()[0]) * (getSideLengths()[1]);

        return output;
    }

    // This is overriding the Polygons toString()
    @Override
    public String toString()
    {
        String output = "";
        output += "I am a rectangle\n";
        output += "My area is: " + area() + "\n";
        output += "My perimeter is: " + perimeter() + "\n";

        return output;
    }

}
