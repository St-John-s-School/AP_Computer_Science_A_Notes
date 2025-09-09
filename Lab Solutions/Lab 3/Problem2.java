/*
Credit to Samuel Caruso!
*/

public class Problem2{
  public static void main(String[] args)
  {
    String s = "12345";
    double length = s.length();
    double half_length = length / 2.0;
    half_length = Math.round(half_length);
    int half_length_int = (int) half_length;
    String first_half = s.substring(0, half_length_int);
    String last_half = s.substring(half_length_int);
    System.out.println(first_half);
    System.out.println(last_half);
  }
}