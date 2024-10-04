import java.util.Scanner;

public class Lab7Problem3_2
{
  public static void main(String[] args)
  {
    int a = 35;
    System.out.println(generateInteresting(a));
  }

  public static boolean checkInteresting(int a)
  {
   int smaller = (int) Math.floor(Math.sqrt(a));
   int bigger = smaller + 2;
   if (smaller * bigger == a) {
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
      int smaller = (int) Math.floor(Math.sqrt(a));
      int bigger = smaller + 2;
      return ((smaller + 1) * (bigger + 1));
   }
   else
   {
      return -1;
   }
  }
}