/*
We figured out how to write and use void methods.
These are methods that don't output (return) a value.
Note that they can be useful, especially when printing things.

Now, let's figure out how to write a method that returns a value.
*/

public class c_ReturningThings {
    public static void main(String[] args) {
        /*
         * Look at each of the methods found below the main method.
         * What do each of them do?
         * What do they return?
         */

        System.out.println("---------------------\n");

        int a = 4;
        int b = doubleNum(a);
        System.out.println(b);

        // String c = "Teo";
        // String d = "Nelson";
        // System.out.println(makeFullName(c, d));

        // int e = 67;
        // boolean isItEven = isEven(e);
        // System.out.println(isItEven);

        System.out.println("\n---------------------");
    }

    public static int doubleNum(int num) {
        int dnum = num * 2;
        return dnum;
    }

    public static String makeFullName(String first, String last) {
        String full = first + " " + last;
        return full;
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }
}