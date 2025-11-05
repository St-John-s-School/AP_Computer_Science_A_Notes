public class b_Anatomy
{
    public static void main(String[] args)
    {
    /*
    An array is a data structure that holds a sequence of values
    (elements) that are all the same type.
    Arrays have indices used to locate the values held in them,
    and these indices are zero-indexed (start at zero).

    You might think "wow, this sounds like a String"
    Your intuition would be correct!

    A String is an array of characters, because:
    1) It holds a sequence of chars
    2) These chars have indices that start from 0

    Arrays are going to allow us to store and access data
    (variables, values) in an organized manner.
    */

    /*
    An Array is an Object, so we use the same syntax we used
    to construct (declare and initialize) objects. We always go:

    <Type of Object> <Object name> = new <Type of Object(parameters)> 

    As an example, see:

    Scanner in = new Scanner(System.in);

    or

    Player one = new Player('x', 1);

    We follow similar formatting to constructing an object.
    <Type of Array>[] <array_name> = new <Type of Array>[<length>];

    Here, <length> represents the number of elements in the array.
    The "[]" on the left side of the expression represents "array".

    Below are examples of initializing different arrays in Java. 

    */

    int[] ages = new int[12];
    double[] GPA = new double[175];
    String[] birthdays = new String[750];    
    }

    /*
    If we were to visualize the "ages" array, it would look like this:

        ┌───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐
ages =  │   │   │   │   │   │   │   │   │   │   │   │   │
        └───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘
    0   1   2   3   4   5   6   7   8   9  10  11

    After declaring and initializing it, we still need to fill it with values. 
    */
}