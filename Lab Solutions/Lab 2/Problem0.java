/*
Credit to Ayush Lalwani!
*/

public class Problem0{
  public static void main(String[] args)
  {
    int length = 5 ;
    int surfaceArea = (int)(Math.pow(length, 2)) * 6;
    int volume = (int)(Math.pow(length, 3));
    System.out.println("The surface are of a cube with side length "
    + length + " is " + surfaceArea + " and the volume is " + volume);

  }
}