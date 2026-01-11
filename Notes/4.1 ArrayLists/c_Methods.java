import java.util.*;

public class c_Methods
{
    public static void main(String[] args)
    {
    /*
    Everything that you can do with an ArrayList is a method.
    Instead of using [] or .length, we will be using methods. 

    The first method we will learn is .add(). 

    If you call .add(v) with one parameter, it will add the 
    parameter v to the end of the ArrayList.

    If you call it with two parameters, like .add(i, v) it will add the 
    v such that it is now in index i.
    */

    ArrayList<String> names = new ArrayList<>();
    names.add("Bob");
    names.add("Carl");
    System.out.println(names);

    names.add(0, "Amy");
    System.out.println(names);

    names.add(3, "Dan");
    System.out.println(names);

    /*
    Notice that you CAN print an ArrayList Object. When we tried this with arrays
    we got that weird 552@bcvjd print statement instead. 

    Now, let's try .get(i). This method is the same as [] in Arrays.
    .get(i) will access and return the element at index i. 
    */

    // String n = names.get(2);
    // System.out.println("The element in index 2 is: " + n);

    /*
    Now, we move on to .set(i, v), which has two parameters.
    .set() will set the element at index i to the value v.
    */

    // names.set(1, "Bailey");
    // System.out.println(names);

    /*
    Next, we have .length().

    This is just like .length for Arrays, but now it's a method
    so its .length(). It returns the length of the ArrayList.

    Remember this is one more than the index of the last element!
    */

    // int l = names.length();
    // System.out.println("The length of the ArrayList is: " + l);

    /*
    Finally, we have .remove(i).

    .remove() removes the element at index i.
    Since the element gets deleted, the indices of the elements
    to its right will change by 1. 
    */

    // names.remove(1);

    }

}