public class a_DeclaringMethods{
    public static void main(String[] args)
    {
      /*
      We've practiced using methods like Math.max() or length(),
      but what if we want to write our own? 
      This set of notes focuses on learning to write and use 
      our own methods in Java. 
      
      In Java, a method is a chunk of code that does something 
      Roughly, there are TWO ways to think about methods in programming
      
      First, we can think of them as mathematical functions:
      1) they have inputs,
      2) and they have outputs
  
      Second, we can think of methods as building blocks
      Every Java program consists of multiple steps
      that are accomplished by individual methods. 

      If you look at the programs you've written so far,
      you can see that they are mainly made of methods. 
      */
  
      /*
      Method Headers
  
      We declare methods in a very particular way: 
        1       2     3    4       5
      public static void name (parameters)
      {
      <body>;
      }
  
      1) determines where our method can be used.

         In this case, we made it "public" which allows
         for our method to be use-able anywhere.     

      2) indicates whether the method "belongs" to a variable.

         static methods can be called without a "."
         Some examples of static methods are:
         Math.pow() or Math.ceil() 

         methods that aren't static won't have static in the header
         Some examples of non-static methods are:
         .length() or .nextInt()

         For now, all our methods will be static methods. 
      
      3) Determines what kind of data our method will output. 

         "void" indicates that the method does not output a particular value.
         It might still do something, like print an output to the user.
         An example of a "void" method is println().

         An example of a "double" method would be Math.pow() or Math.round()
         In the case of a data returning method,
         you would indicate the type of data you would like to return.

         This modifier means that the method MUST return the specified type.
  
      4) The name of the method.
         We don't capitalize the first character of any method name,
         and we try to make our method names informative.
  
      5) These are our parameters which are the inputs into our method.
         This is data that our method needs to work. 
         These parameters are the variables that the method will use. 
      
         Some methods don't have any parameters, and some methods have multiple.
         
        Putting it all together, we need five things to declare a method.
        Once we declare that method, we can use it.

        Q: How might we make a method declaration for a method that takes
        two ints, multiplies them, and returns the product?

        Q: How might we make a method declaration for a method that takes
        a String, determines if it is a palindrome, then returns the result? 
      */
    }
}