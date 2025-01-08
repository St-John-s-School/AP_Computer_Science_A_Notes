public class Lab1Problem3_1{
    public static void main(String[] args)
    {
     int fahrenheit = 76;
     int subtract = 32;
     double a = 5.00;
     double b = 9.00;
     int part1 = (fahrenheit-subtract);
     double part2 = (part1*a);
     double celcius = (part2/b);
     System.out.println(celcius);
     double part3 = (celcius*b);
     double part4 = (part3/a);
     double part5 = (part4 + subtract);
     System.out.println(part5);
    }
  }