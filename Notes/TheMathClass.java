/*
Notes Outline:
0) Lab 1 Review
1) What is a class? What are methods?
2) Math Class methods
3) Practice
4) Lab 2 Overview
*/

/*
-1) Housekeeping

If you want the "newest" version of my notes or any repository, you'll have to make a new Codespace. 
To do so, you can go to https://github.com/codespaces, delete your Codespace for a certain repository,
then open the repository in Codespaces again. 

NOTE: This will lose any uncommited changes. 
*/

/*
0) Lab 1 Review

Let's look at two different solutions for Problem 3 on the Lab. One of them, in fact, is from a student!
Questions to think about: 

- How did the two writers think about how to solve the problem?

- What makes a particular computer program better than another? 
*/

/*
1) What is a Class. What is a method?

Method: 
- A method is "a set of instructions that can be referred to by name"
- Methods might have parameters and might return values. In this sense, they're like functions in math. 
- Ex. One method we've used a lot so far is println(). It tells the computer to print out whatever is input.
  Whatever is input is then referred to as a "parameter". 

Class: 
- For now, a good definition for a class is a "collection of code with common purpose and properties"
- Classes might have a lot of methods. 
- When we say properties, we might mean things like variables. 
- An example of a Class is the Math Class. All of the code is related to mathematics in Java. 
- Later in this course, we will write our own Classes. For now, it's safe to think of them as Java code
that has already been written for you to use.
*/

public class TheMathClass {
    public static void main(String[] args)
    {
    /*
    2) Math Class Methods
    The Math Class (notice that the name of a Class like Math is always capital. 
    This helps distinguish a Class name from a variable name) is a Class.

    This means it has some relevant methods that might be useful for us.
    We're going to "call" (use) these methods by following a particular formula.

    We write: 

    Math.method_name(parameters);

    We know the following important Math Class methods:

    Math.abs()
    Math.exp()
    Math.ceil() and Math.floor()
    Math.max() and Math.min()
    Math.pow()
    Math.random()
    Math.round()
    Math.sqrt()

    Some useful methods have intentionally not been listed.
    They're on Table 3.2 of the textbook. 
    */

    // double a = Math.pow(3,4);
    // System.out.println("a = " + a);
    // int b = Math.abs(-52);
    // System.out.println("b = " + b);
    // int c = Math.max(1, 11);
    // System.out.println("c = " + c);
    // int d = Math.min(1, 11);
    // System.out.println("d = " + d);
    // double original = Math.random();
    // System.out.println("original = " + original);
    // int rounded = Math.round(original);
    // System.out.println("rounded = " + rounded);
    // int mystery = Math.sqrt(Math.pow(4,3));
    // System.out.println("mystery = " + mystery);
    /*
    The above examples show us some important facts:
    - methods return different types of variables
    - We can compose methods
    - methods can return (output) values that can be stored as variables
      or used in other calculations. 
    */

    /*
    Let's do two practice problems.

    0) Write a computer program that makes a random double between 0 and 3 and prints it out. 

    1) Write a computer program that finds the minimum of three integers and prints it out. 
    */
    }
  }
