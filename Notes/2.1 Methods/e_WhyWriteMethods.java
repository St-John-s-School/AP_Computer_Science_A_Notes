import java.util.Scanner;

/*
One might wonder why we need to write methods. After all,
don't they just do the same things that we already
know how to do?

The main thing is that they help us manage complexity.
As the programs we write get more complex and longer,
it makes sense that we delineate segments of code that
do particular things as methods.

Methods:
- Do one thing well
- Are re-usable
- Have descriptive names
- Make the main method more readable

These ideas are often what we call "abstraction"
in programming. We can first write a method,
figure out that it works, then not worry about how
it works ever again. In a sense, the calculations
or complexity in the program become "abstract". 

For some reason, when I think of abstraction, I think
about microwaves. When I use a microwave, I do not 
think about how it works. I just put in a time,
and hot food comes out.

We want our methods to be like microwaves. They work,
we know how to use them, and that's all that matters...

Please consider the code below that does some stuff with rectangles
*/

public class e_WhyWriteMethods
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter length 1: ");
        double length1 = in.nextDouble();
        System.out.print("Enter width 1: ");
        double width1 = in.nextDouble();
        
        double area1 = length1 * width1;
        double perimeter1 = 2 * (length1 + width1);
        
        System.out.println("Rectangle 1:");
        System.out.println("Area: " + area1);
        System.out.println("Perimeter: " + perimeter1);
        if (length1 == width1)
        {
            System.out.println("square");
        } 
        
        System.out.print("Enter length 2: ");
        double length2 = in.nextDouble();
        System.out.print("Enter width 2: ");
        double width2 = in.nextDouble();
        
        double area2 = length2 * width2;
        double perimeter2 = 2 * (length2 + width2);
        
        System.out.println("Rectangle 2:");
        System.out.println("Area: " + area2);
        System.out.println("Perimeter: " + perimeter2);
        if (length2 == width2)
        {
            System.out.println("square");
        } 
    }
}