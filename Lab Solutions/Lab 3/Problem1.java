/*
Credit to Denzel Briggs!
*/

public class Problem1{
  public static void main(String[] args)
  {
    //Write a program that prints out the number of characters in a String, and then prints out the last character of that String. 
    String test = "abcdef";
    int testlength = test.length();
    System.out.println(testlength);
    char last = test.charAt(testlength - 1);
    System.out.println(last);
  }
}