/*
Credit to Ben Sandberg

NOTE: Can you think of better variable names than a, b, ..., e? 
*/

public class Problem1{
  public static void main(String[] args)
  {
    double a = 5 * Math.random();
    double b = 5 * Math.random();
    double c = Math.pow(a,b);
    double d = Math.pow(b,a);
    double e = Math.max(c,d);
    System.out.println("The larger of the two values is " + e + ".");
  
  }
}