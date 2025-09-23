/*
Now that we know how to declare a method,
we should think about the body of the method. 

This is the code that will run when someone
uses your method. 

The first methods we will think about are methods
that don't return anything. These methods are called
void methods, since that's what you write in the method
declaration.
*/

public class b_WritingMethods{
    public static void main(String[] args)
    {
    /*
    To call (use) a method, we do what we have always done,
    which is write the method name with parentheses.
    */

    System.out.println("---------------------\n");

    sayHello();

    System.out.println("\n---------------------");

    /*
    Q: Can we write a method that greets someone by name?
    What parameter might we need? 
    As a reminder, parameters are variables
    inside the method body.     
    */
    }

    public static void sayHello() 
    {
      System.out.println("Hello");
    }

}