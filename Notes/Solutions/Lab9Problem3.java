public class Lab9Problem3
{
  public static void main(String[] args)
  {
    System.out.println(reverse(""));
  }
  public static String reverse(String string)
  {
    String newstring = "";
    for (int i = string.length()-1; i >= 0; i--)
      {
        newstring = newstring + string.charAt(i);
      }
      return newstring;
  }
}