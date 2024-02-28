// The extends key word signifies which class we would like to inherit.
// This creates an is-a relationship as RightTriangle is-a Polygon

public class RightTriangle extends Polygon
{
    public RightTriangle()
    {
        super(3);
    }

    // The perimeter() and area() are overriden from the Polygon class
    // this lets us use a right triangle forumla for perimeter and area
    @Override
    public double perimeter()
    {
        double output = 0.0;

        for(int i = 0; i < this.getSideLengths().length; i++)
        {
            output += this.getSideLengths()[i];
        }

        return output;
    }

    @Override
    public double area()
    {   
        double area1 = this.getSideLengths()[0] * this.getSideLengths()[1] / 2;
        double area2 = this.getSideLengths()[1] * this.getSideLengths()[2] / 2; 
        double area3 = this.getSideLengths()[0] * this.getSideLengths()[2] / 2;
        
        return (Math.min(Math.min(area1, area2),area3));
    }

    // This is overriding the Polygons toString()
    @Override
    public String toString()
    {
        String output = "";
        output += "I am a right triangle\n";
        output += "My area is: " + area() + "\n";
        output += "My perimeter is: " + perimeter() + "\n";

        return output;
    }
}
