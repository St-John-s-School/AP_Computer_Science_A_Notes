public class a_StringBasics
{
    public static void main(String[] args)
    {
        /*
        Now that we can do a lot of arithmetic, it's time to focus on 
        programs that work with written text. Maybe these programs can
        deal with things like names, messages, or passwords. 

        We've already discovered that we can use written text as long as 
        its enclosed in double quotations (" ").

        It turns out we can store written text in a new kind of variable
        called a String. 

        To create a String, put some text in double quotes and store it in
        a String variable. Just like other variables, Java needs
        1) Type (String)
        2) Name (s)
        3) Value ("Hi, I'm a String") that is being assigned

        Ex: String s = "Hi, I'm a String";
        */
        System.out.println("--------------------");

        String s = "Hi";
        System.out.println(s);

        String t = ", I'm a String";
        System.out.println(s + t);

        /*
        Using + to combine two strings is called "concatenation".
        */

        /*
        Strings can have numbers in them, but Java will not interpret
        Strings numerically. 
        */

        // String a = "5";
        // String b = "6";
        // System.out.println("The sum of " + a + " and" + " b is: " + a + b);
    }
}