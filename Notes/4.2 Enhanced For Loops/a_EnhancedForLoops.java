import java.util.*;

public class a_EnhancedForLoops
{
    public static void main(String[] args)
    {
    /*
    Now that we've learned the basics of ArrayLists,
    it's time to go over a new kind of loop that 
    goes really well with ArrayLists. 

    This loop is called the Enhanced For Loop!
    It should be used when:

    1) The loop does not involve editing the elements of the ArrayList
    2) Every element is accessed, in order, from index 0 to the end

    The syntax is: 

    for (type name : ArrayListName)
    {
    // Do something
    }

    This loop doesn't have indices, and will automatically
    do the body of the loop to every element of the ArrayList.
    */

    ArrayList<String> places = new ArrayList<>();
    places.add("Houston, Texas");
    places.add("Boston, Massachusetts");
    places.add("Chicago, Illinois"); 
    places.add("New York, New York");

    System.out.println();

    for (String p : places)
    {
        System.out.println(p);
    }

    System.out.println();

    // System.out.println();

    // for (String p : places)
    // {
    //     System.out.println(p.substring(0, p.indexOf(",")));
    // }

    // System.out.println();


    /*
    This loop lets you easily do things to an ArrayList
    as long as you aren't adding or removing elements from the List.

    This limitation is because that would mess with the automated 
    nature of the ArrayList.
    */

    }


}