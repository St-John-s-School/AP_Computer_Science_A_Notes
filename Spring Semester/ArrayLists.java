import java.util.*; // for ArrayList

public class ArrayLists
{
  public static void main(String[] args)
  {
    /*
    We have gotten pretty good at making arrays of things (ints, Cards, etc)
    Arrays are great, but they have some limitations. 
    Today, we are going to learn about a more general data structure that we can also use to store data.
    This one, ArrayList, represents a more generalized definition of what it means to be a "list" of things.
    */

    /*
    ArrayLists are Objects. 
    In fact, the inner machinery of ArrayList objects actually use arrays to store data.
    ArrayList has extra functionality on top of what arrays
    already provide. 
    ArrayLists can:
    1) add and remove elements
    2) change size automatically.
    3) use methods (notice that there are no Array methods). 
    */

    /*
    As they differ from arrays, ArrayLists are always made up of Objects.
    Arrays can use Objects or "primitive" types. Primitives are types like ints, and are lower case.  
    */

    /*
    To use ArrayList, we need to import it from the Java.util.* library.
    The * means we can import everything from that library, including Scanner.
    */

    /*
    To construct an ArrayList, we use the syntax: 
    ArrayList<E> list = new ArrayList<E>();

    where E is the class of Objects we are storing.
    Therefore, 
    ArrayList<String> list = new ArrayList<String>();      
    would make an empty ArrayList of Strings.
    Notice that we don't need to worry about the size of the ArrayList anymore!
    It can change as we add or remove elements. 
    /*

    /*
    Conveniently, Java has a shorthand way to declare ArrayLists.
    If you use the <> (diamond operator), you can instead write:
    ArrayList<String> list = new ArrayList<>();

    and Java will be perfectly fine with it. 
    */

    ArrayList<String> teachers = new ArrayList<>();
    teachers.add("Posa");
    teachers.add("Gao");
    teachers.add("Bigge");

    System.out.println("My favorite teachers: " + teachers);
    System.out.println("The third teacher on my list is: " + teachers.get(2));
    
    /*
    Notice that unlike arrays, the ArrayList class has it's own toString() method. 
    (Remember, classes can have particular methods).  
    What this means is that you don't need to write your code for printing the elements of an ArrayList. 
    When you print an ArrayList, as we saw above, Java already has a method (and thus knows to) print the contents out 
    even without needing a loop. 

    In addition to that, being a class, ArrayLists use methods like get()
    instead of [] to access certain elements.    
    This will take some getting used to, but just remember,
    for ArrayLists, almost everything we "do" with them
    involves a method belonging to the ArrayList class. 
    */

    /*
    teachers.add(1, "Bounds");
    System.out.println("My favorite teachers: " + teachers);
    */

    /*
    Add is an "overloaded" method. If we have an integer as the first parameter, 
    add() will insert the new element so that it has index equal to the parameter.
    Now Mr. Bounds is in index 1!

    Let's say that Mr. Posa has wronged us in some unforgivable way and we want to remove him. 
    It's as simple as:
    */
    
    /*
    teachers.remove(3);
    System.out.println("My favorite teachers: " + teachers);
    System.out.println(teachers.size());
    */
    
    /*
    Notice that ArrayLists have a new method to find their length.
    They use size(), which returns the number of elements. 
    */

    /*
    Now let's say that Mr. Bounds has been found guilty of tax evasion
    and we want to replace him with Mr. Sakach.
    We can use the set(index, Element) method to do this.
    */

    /*
    teachers.set(2, "Sakach");
    System.out.println("My favorite teachers: " + teachers);
    */

    /*
    Unlike Arrays, ArrayLists don't really have a fast way to add a bunch of elements at once that anyone uses. 
    We are generally content calling .add() over and over. You can use a loop for this, though.
    */

    /*
    The final thing we need to discuss today is the Wrapper class. Notice that ArrayLists only work on Objects,
    which isn't the best since integers, doubles, characters, and so on, aren't Objects.

    This conundrum motivates the idea of a Wrapper class, which is basically the answer to the question:
    "What if we made a primitive type an Object?"

    Wrapper classes have already come in handy for methods like Integer.parseInt().
    When you think about it, it makes sense to have an Integer class with methods that are related to integers,
    like finding the integer value of a String! 
    This is the benefit of a Wrapper class.
    */

    /*
    int x = 38;
    Integer y = new Integer(38);
    */

    /*
    Both lines of code above are trying to represent the integer value 38. 
    The second one, which uses the Wrapper class, actually makes a space in memory that stores a 
    reference to another space in memory that stores the value "38", but that's a story for another time. 
    */

    /*
    ArrayList<Integer> list = new ArrayList<>();
    list.add(13);
    list.add(47);
    list.add(15);
    list.add(9);
    int sum = 0;
    for (int i = 0; i < list.size(); i++)
    {
        sum += list.get(i);
    }
    System.out.println("list = " + list);
    System.out.println("sum = " + sum);
    */

    /*
    Notice that in the block of code above, we don't need to "unwrap" the Integer wrapper class.
    Java does it for us.
    We just need to remember to utilize the Wrapper class in the first place. 
    */

    /*
    Problems to think about: 

    0) When might we want to use an ArrayList over an array? How about vice versa?

    1) Write code to declare an ArrayList storing the first 10 positive integers. Use a loop for this.
    
    2) How might you redo the previous problem, but so that the ArrayList is generated "backwards".
       As in, it's going to be [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]?

    3) 
    public static void mystery2(ArrayList<Integer> list) {
      for (int i = list.size() - 1; i >= 0; i--) {
        if (i % 2 == 0) {
           list.add(list.get(i));
         } 
        else {
         list.add(0, list.get(i));
        }
       }
       System.out.println(list);
      }
    */
  }
  
}
