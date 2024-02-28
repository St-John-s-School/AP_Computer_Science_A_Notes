public class Square extends Rectangle
{
    public Square()
    {
        super();
    }

    @Override
    public void print()
    {
        System.out.println("I am a square");
        System.out.println("My area is: " + area());
        System.out.println("My perimeter is: " + perimeter());
    }
}
