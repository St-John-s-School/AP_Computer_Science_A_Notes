import java.util.Scanner;

public class Lab7Problem4
{
  public static void main(String[] args)
  {
    int a = 13579;
    System.out.println(checkAscending(a));
  }

  // Do not touch!
  public static boolean checkAscending(int num){
    int length = (int) Math.log10(num) + 1;
    int nines = (int)Math.pow(10, length) - 1 ;
    int difference = nines - num;
    return checkDescending(difference);
  }
  public static boolean checkDescending(int num)
  {
    int[] digits = Integer.toString(num).chars().map(c -> c-'0').toArray();
    for(int i = 0; i < digits.length - 1; i++)
    {
      if (digits[i] <= digits[i + 1])
      {
        return false;
      }
    }
    return true;
  }
}