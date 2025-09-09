/*
Credit to Mr. Gao
*/

public class Problem2
{
  public static void main(String[] args)
  {
    int digits = 3;
    int lower_bound = (int) Math.pow(10, digits - 1);
    int upper_bound = (int) Math.pow(10, digits);
    int distance = upper_bound - lower_bound;

    // This will give us a random number between 0 and (upper bound - lower bound)
    int first_random = (int) ((distance) * (Math.random()));

    // Once we add the lower bound, we will now have a random number between
    // the lower bound and the upper bound
    int second_random = first_random + lower_bound;
    System.out.println(second_random);

    /*
    As an example, if digits is equal to 3, then:
    lower_bound = 100
    upper_bound = 1000
    distance = 900

    So, first_random is a random number between 0 and 900 (not including 900).
    If we add lower_bound (100), then

    second_random is a random number between 100 and 1000 (not including 1000). 
    */

  }
}