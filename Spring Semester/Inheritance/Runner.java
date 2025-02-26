public class Runner
{
    public static void main(String[] args)
    {

        // Generally, polymorphism is the idea that
        // one Object can be described in multiple forms
        // Depending on the context, a Square
        // can be treated as a general polygon,
        // or as a Square, or even a Rectangle.

        // This is a concept of polymorphism called upcasting
        // we can store the different instances of a class
        // in an object of its parent type.
        Polygon[] shapes = new Polygon[4];
        shapes[0] = new Polygon(5);
        shapes[1] = new Rectangle();
        shapes[2] = new RightTriangle();
        shapes[3] = new Square();
        
        for(int i = 0; i < shapes.length; i++)
        {
            // This concept is polymorphism in which the appropriate version of
            // the toString() is called 
            System.out.println(shapes[i]);
        }

    }
}