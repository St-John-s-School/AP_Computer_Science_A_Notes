/*
Credit to Taylor Synnott! 
*/


public class Problem3
{
  public static void main(String[] args)
  {
    int number1 = 3;
    int number2 = 4;
    int number3 = 8;
    double mean = (number1 + number2 + number3) / 3.0;
    int max = Math.max(number1, Math.max(number2, number3));
    int min = Math.min(number1, Math.min(number2, number3));
    int median = (number1 + number2 + number3) - max - min;
    System.out.println("The mean of {" + number1 + "," + number2 + "," + number3 + "} is " + mean + " and the median is " + median + ".");

    

  }
}