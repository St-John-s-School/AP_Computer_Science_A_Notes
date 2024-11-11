public class Lab9Problem4
{
  public static void main(String[] args)
  {
    System.out.println(checkPrime(12));
  }
  public static boolean checkDivisibility(int a, int b)
  {
    if (a%b == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public static boolean checkPrime(int p)
  {
    for (int i = 2; i <= Math.sqrt(p); i++)
    {
      if (p % i == 0)
      {
        return false;
      }
    }
    return true;
  }
}