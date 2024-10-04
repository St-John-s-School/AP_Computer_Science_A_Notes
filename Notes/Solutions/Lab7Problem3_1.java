import java.util.Scanner;

public class Lab7Problem3_1
{
  public static void main(String[] args)
  {
    int a = 35;
    System.out.println(generateInteresting(a));
  }

  public static boolean checkInteresting(int a)
  {
   double square = Math.sqrt(a+1);
   int square_floor = (int) square;
   if (square==square_floor) {
      return true;
   }
   else {
      return false;
   }
  }

  public static int generateInteresting(int a)
  {
   if (checkInteresting(a)==true)
   {
      return (a*(a + 2));
   }
   else
   {
      return -1;
   }
  }
}