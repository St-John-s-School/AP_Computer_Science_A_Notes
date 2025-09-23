public class d_MethodParameters
{
/*
Parameters are variables that get their values
when the method is actually called.

Here are some properties about parameters:
- Parameters are variables. When you call a method,
  they are declared and initialized.
- You can have as many parameters as you need 
- You must "match" parameters with the method header
  when you call a method
- Parameters stop existing when the method ends

Fun Fact: You can put methods wherever you want
in your file, as long as its not inside main()
or outside te outermost brackets.

This means you can put them first (above main). 
*/

public static double calculateGrade(double q, double t, boolean didHW) {
    /*
    Homework Calculation:
    30% quiz
    70% test
    50% off your grade if you didn't do the homeworks
    */
    double average = q * 0.3 + t * 0.7;
    if (!didHW)
    {
        average /= 2;
    }
    return average;
}

    public static void main(String[] args)
    {
        System.out.println("--------------------");

        double quizAverage = 88.0;
        double testAverage = 92.0;
        boolean hw = true;
        
        double grade = calculateGrade(quizAverage, testAverage, hw);
        System.out.println("Final grade: " + finalGrade);

        /*
        Q: What happpens if you call calculateGrade without 
        the requisite parameters?

        Q: Can you call calculateGrade with the parameters
        in a different order?

        Q: Can you pass in values instead of variables for a method?

        Q: Can you use q, t, average, or didHW in main()?

        Q: Why doesn't it really matter that q, t, etc stop existing?
        */

        /*
        Truthfully, understanding that parameters are copies of 
        variables that will stop existing is vital in Java.

        If your teacher makes boxes to represent what is going on
        when you call a method, please pay attention! 
        */
    }
}