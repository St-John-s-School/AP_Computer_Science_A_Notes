import java.util.Scanner;

public class Arrays {
  public static void main(String[] args) {
    /*
    As we continue to build more complex programs, we might run into the following problem:
    Imagine a program where we need to keep track of every student's age. 

    We might write something like this:
    int age_1;
    int age_2;
    int age_3;
    int age_4;
    int age_5;
    ...

    This isn't great! 
    It also motivates the idea of a "data structure". 
    */

    /*
    An array is a data structure that holds a sequence of values (elements)
    that are all the same type.
    Arrays have indices used to locate the values held in them,
    and these indices are zero-indexed (start at zero).

    A String is an array of characters.
    Re-phrased, a String is an array whose elements are character data types.

    Arrays are going to allow us to store and access data (variables, values) 
    in an efficient manner.
    */

    /*
    Constructing arrays:
    We follow similar formatting to constructing an object.
    <element_type>[] <array_name> = new <element_type>[][<length>];

    Here, length isn't zero-indexed. It represents the number of elements in the array.
    The "[]" on the left side of the expression represents "array".
    */

    /*
    int[] ages = new int[16];
    double[] GPA = new double[175];
    String[] birthdays = new String[750];
    //*/

    /*
    Notice that we haven't initialized any of the elements in our array. 
    Java actually auto-initializes the elements to "default" values. 

    We can access elements of an array by writing:
    <array_name>[<index>];
    */

    /*
    System.out.println(ages[0]);
    System.out.println(GPA[7]);
    System.out.println(birthdays[531]);

    ages[0] = 16;
    System.out.println(ages[0]);

    birthdays[531] = "03/09/2008";
    System.out.println(birthdays[531]);
    //*/

    /*
    The ability to easily access any element of an array let's us
    efficiently initialize every value of an array with a loop.
    */

    /*
    Scanner in = new Scanner(System.in);
    
    // Declare ages_carrier to have length equal to number of students in carrier: 
    int[] ages_carrier = new int[15];
    for (int i = 0; i < ages_carrier.length; i++) {
      ages_carrier[i] = in.nextInt();
    }

    for (int i = 0; i < ages_carrier.length; i++) {
      System.out.println(ages_carrier[i]);
    }
    //*/

    /*
    As seen above, <array_name>.length gives us the number of elements
    in an array. We don't use length() like we do for Strings.
    */

    /*
    Practice problem: 
    What will be the contents of the array after the following code segment?
    What data type is list[i] for any relevant i? 
    */

    /*
    int[] list = new int[5];
    for (int i = 0; i < list.length; i++) {
      list[i] = 2*i + 1;
      System.out.println(list[i]);
    }
    //*/

    /*
    An important idea for arrays is that every element of the array
    is the specified type.
    As in, each list[i], whether it's list[0], list[list.length - 1],
    or list[list.length / 2], are all ints. 
    */

    /*
    The final thing we are going to go over is a shortcut for initializing arrays:
    we can initialize arrays when we construct (declare) them, writing: 
    <element_type>[] <array_name> = {<value>, <value>, ..., <value>};
    */

    /*
    String[] names = {"John", "Paul", "George", "Ringo"};
    int[] carrier_sizes = {13, 16, 16};
    //*/

    /*
    Notice that this is the second time in Java we've constructed an Object
    without using new. 

    The other time was when we first learned how to make Strings.
    Sometimes the people who wrote Java give us a break and let us do things
    in a more convenient way. 
    */

    /*
    Final Practice Problem:
    What does the following code segment do?
    //*/
    
    /*
    String[] teachers = {"Gao", "Bounds", "Posa"};
    for (int i = 0; i < teachers.length; i++) {
      System.out.println(teachers[i].charAt(teachers[i].length() - 1));
    }
    //*/
  }
}
