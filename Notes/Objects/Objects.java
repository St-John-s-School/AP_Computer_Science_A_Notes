/*
Notes Outline:
0) Lab 7 Review
1) What are Objects
2) Why are Objects important?
3) How do we use Objects?
4) BankAccount Class
5) Lab 8 Assigned
*/

/*
Lab 7 Review
0) What do we enjoy about these solutions?

1) What did we learn from these solutions? 
*/

public class Objects
{
  public static void main(String[] args)
  {
    /*

    1) What are Objects?
    So far in this class, we've really been focused on variables and methods.
    In particular, we've thought of building programs by 
    combining a bunch of actions (methods) into a coherent procedure.
    We call this procedural programming.
    
    Today, we're going to discuss object-oriented programming,
    another way of thinking about solving problems with a program.

    Definition: Objects are the combination of data and behavior.
    They are both. 
    Data is stored in variables.
    Behavior is modeled by methods. 
    
    Other examples of entities made of multiple parts would be 
    things like how the government is made of three branches, or how many religions
    think that "man" or "God" are made up of multiple simultaeneous ideas (body, mind, spirit, etc).

    An example of an Object is a String. Strings have data (the text of the String)
    and also behaviors (methods) such as charAt() or length().
    So, it's fair to not just think of Strings as chains of characters,
    but also as including methods that make these characters useful, like .indexOf().

    For now, let's not worry about how to make new kinds of Objects, but instead just
    think about why we use them and how to use them.

    2) Why Objects?
    As we build larger programs, we might get into situations
    where we can't really manage all these different methods and variables.
    Objects organize related data and behaviors into a single encapsulated entity.
    
    Also, objects are useful because they:

    Represent real-world concepts in computer science
    Reduce complexity of programs (tons of variables -> one object)
    Are always built for a specific task or goal
    Are re-usable
    "Abstract" away unnecessary details (implementations we don't need to know about)

    3) How do we Use Objects?

    Making an Object (Constructor)

    We mentioned that we aren't going to define our own Objects for a while, 
    but we can still "make" them in our programs just like how we 
    made new variables. 

    To "construct" an object, we use the following syntax:
    Object_type name = new Object_type(parameters);
    Often parameters are the data of our objects.

    For example, we've used syntax like:
    Scanner in = new Scanner(System.in);

    In this case, Scanner is the type of our Object (A Scanner object)
    and "in" is the name of this object.
    System.in is a parameter (it's not relevant why it's a parameter)
    
    Notice that the "constructor" is actually a method
    It has a name, parentheses, and does something. 
    
    Data (Instance Variables)
    
    Objects contain relevant data. This data is in the form of variables.
    Another term for Objects is instances, so we refer to these variables
    as instance variables. 

    We can use instance variables in the same way that we use other variables.

    Behavior (Instance Methods) 

    Objects also have particular behaviors. We call these instance methods.
    These are methods that "belong" to objects.

    We call instance methods using the syntax:
    object_name.method_name().

    In a sense, we are saying:
    "Hey, object_name, go ahead and do method_name()". 

    Reference

    While methods don't change the values of variables,
    they do change the state of Objects.

    We will practice with a few examples. 
    */
  }
  
}
