import java.util.*;

public class b_Anatomy
{
    public static void main(String[] args)
    {
    /*
    You can think of an ArrayList as a more general version
    of an Array. It's a "list" of Objects that can:
    1) add or remove elements
    2) change size automatically
    3) use methods

    The reason ArrayList can do all these things is because the list
    itself is an Object.

    (It's been a while, but remember an Object is data
    that has its own methods)
    */

    /*
    Before we start using ArrayLists, there are two important notes:
    1) You need to import them with the command:
    import java.util.*; 
    
    2) ArrayLists can only have Objects for elements. This means
    we can't use int, double, char, boolean, etc. 
    (There is a workaround for this)
    
    */

    /*
    To construct an ArrayList, we use the syntax:
    ArrayList<Object> list = new ArrayList<Object>();

    Notice that this looks like how we make an object
    with the new keywork and parentheses.

    Here, Object represents the TYPE of the Object we want our ArrayList to have.
    Also, notice that we don't need to say a length. ArrayList calculates length for us.
    */

    }
    ArrayList<String> names = new ArrayList<String>();

    /*
    You can also use the shorthand syntax:
    ArrayList<Object> list = new ArrayList<>();

    Basically, you don't need to say the type of Object twice.
    */

}