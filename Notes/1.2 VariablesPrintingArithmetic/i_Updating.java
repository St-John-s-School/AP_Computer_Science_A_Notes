public class i_Updating
    {
    public static void main(String[] args)
        {
        /*
        You might want to update the value of a variable.
        To do so, we can:
        1) Assign it to it's old value with some operation done on it
        or 
        2) combine an arithmetic operator and the assignment operator.
        */

        System.out.println("--------------------");

        double a = 5.0;
        System.out.println("a is currently: " + a);
        a = a + 2.5;
        System.out.println("Now a is: " + a);
        a = a * 2;
        System.out.println("Now a is: " + a);
        a += 7;
        System.out.println("Now a is: " + a);
        a /= 11;
        System.out.println("Now a is: " + a);
    }
}