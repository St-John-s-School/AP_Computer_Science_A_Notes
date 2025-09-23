import java.util.Scanner;

public class f_ExampleWithMethods
{
    public static double calculateArea(double l, double w)
    {
        return l * w;
    }
    
    public static double calculatePerimeter(double l, double w)
    {
        return 2 * (l + w);
    }

    public static boolean isSquare(double l, double w)
    {
        return l == w;
    }
    
    public static void analyzeRectangle(double l, double w)
    {
        double area = calculateArea(l, w);
        double perimeter = calculatePerimeter(l, w);
        
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Is the rectangle a square? " + isSquare(l, w));
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter length 1: ");
        double length1 = in.nextDouble();
        System.out.print("Enter width 1: ");
        double width1 = in.nextDouble();
        analyzeRectangle(length1, width1);
        
        System.out.print("Enter length 2: ");
        double length2 = in.nextDouble();
        System.out.print("Enter width 2: ");
        double width2 = in.nextDouble();
        analyzeRectangle(length2, width2); 
        
        scanner.close();
    }
}