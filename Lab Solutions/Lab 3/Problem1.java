/*
Credit to Denzel Briggs!
*/

public class Problem1{
  public static void main(String[] args)
  {
    String test = "abcdef";
    int testlength = test.length();
    System.out.println(testlength);
    char last = test.charAt(testlength - 1);
    System.out.println(last);
  }
}