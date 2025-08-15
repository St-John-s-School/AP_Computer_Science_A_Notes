public class h_Casting
    {
    public static void main(String[] args)
        {
        /*
        You might want to turn an int into a double or vice versa.

        To turn an int into a double, just store it in a new, double variable.

        To turn a double into an int, we can "cast" it. 
        To cast a variable, we use the following syntax
        int a = (int) 4.5;
        
        or

        double b = 5.5;
        int a = (int) b;

        Casting always rounds down
        */
        
        System.out.println("--------------------");

        System.out.println("Casting an int to a double");
        int a = 4;
        double b = a;
        System.out.println("We should have a .0 now ---> " + b);

        System.out.println("Casting a double to an int");
        double c = 7.6;
        int d = (int) c;
        System.out.println("We should have an int now ---> " + d);

    }
}