public class a_Review
{
    public static void main(String[] args)
    {
      /*
      To recap, methods present a new way to organize code,
      which is based on chunks of code that do one task,
      then return the output of the task (unless they're void)

      Below is an example of a method.
      
      Think about the following questions related to the method:

      1) name?
      2) return type?
      3) parameters?
      4) What does it do?
      */

    System.out.println("---------------------\n");

    System.out.println(isItTheWeekend("Friday", 14));

    System.out.println("\n---------------------");        

    }

    public static boolean isItTheWeekend(String day, int hour)
    {
        if (day.equals("Saturday") || day.equals("Sunday"))
        {
            return true;
        }
        else if (day.equals("Friday") && hour > 16)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}