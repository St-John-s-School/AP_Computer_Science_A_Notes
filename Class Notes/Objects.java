public class Objects
{
  public static void main(String[] args)
  {
    /*
    So far in this class, we've really been focused on variables and methods.
    In particular, we've thought of building programs by 
    combining a bunch of actions (methods) into a coherent procedure.
    We call this procedural programming.
    
    Today, we're going to discuss object-oriented programming,
    another way of thinking about solving problems with a program.
    */

    /*
    Objects

    Definition: Objects are the combination of data and behavior.
    They are both. 
    Data is stored in variables.
    Behavior is modeled by methods. 
    
    Other examples of entities made of multiple parts would be 
    things like how the government is made of three branches, or how many religions
    think that "man" is made of multiple parts like body, soul, spirit, etc.

    An example of an Object is a String. Strings have data (the text of the String)
    and also behaviors (methods) such as charAt() or length().
    So, it's fair to not just think of Strings as chains of characters,
    but also as including methods that make these characters useful, like .indexOf().

    For now, let's not worry about how to create our own Objects, but instead just
    think about why we use them and how to use them.
    */

    /*
    Motivation
    As we build larger programs, we might get into situations
    where we can't really manage all these different methods and variables.
    Objects organize related data and behaviors into a single entity.
    
    Also, objects are useful because they:
    
    Reduce complexity of programs (tons of variables -> one object)
    Are always built for a specific task or goal
    Are re-useable
    "Abstract" away unnecessary details (implementations we don't need to know about)
    */

    /*
    Data (Instance Variables)
    
    Objects contain relevant data. This data is in the form of variables.
    Another term for Objects are instances, so we refer these variables
    as instance variables. 
  
    */

    /*
    Behavior (Instance Methods) 

    Objects also have particular behaviors. We call these instance methods.
    These are methods that "belong" to objects.

    We call instance methods using the syntax:
    object_name.method_name().

    In a sense, we are saying:
    "Hey, object_name, go ahead and do method_name()". 
    */

    /*
    Making an Object (Constructor)

    We mentioned that we aren't going to define our own Objects for a while, 
    but we can still "make" them in our programs just like how we 
    made new variables. 

    To "construct" an object, we use the following syntax:
    Object_type name = new Object_type(parameters);

    For example, we've used syntax like:
    Scanner in = new Scanner(System.in);

    In this case, Scanner is the type of our Object (A Scanner object)
    and "in" is the name of this object.
    System.in is a parameter (it's not relevant why it's a parameter)
    
    */

    /*
    Implicit Parameters 
    
    
    */

    /*
    A BankAccount Object
    
    
    */
  }
  
}
