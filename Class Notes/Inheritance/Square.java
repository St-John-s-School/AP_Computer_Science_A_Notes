// The extends key word signifies which class we would like to inherit.
// This creates an is-a relationship as Square is-a Rectangle

public class Square extends Rectangle
{
    public Square()
    {
        super();
    }

    @Override
    public String toString()
    {
        String output = "";
        output += "I am a square\n";
        output += "My area is: " + area() + "\n";
        output += "My perimeter is: " + perimeter() + "\n";

        return output;
    }
}
