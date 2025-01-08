/*
Last lecture, we learned the basics of GitHub and Codespaces,
and we also built our first program. 

Notes Outline:
0) Variables and why they're useful
1) Printing
2) Arithmetic
3) Lab 1 Overview

*/

public class VariablesPrintingArithmetic {
    public static void main(String[] args)
    {
        /*
        0) Variables and why they're useful

        Last class, we learned how to print things and run code
        As we move on to more complex programs, we're going to need a way to store information
        Imagine the following program that is going to add any two numbers 
        */

        // System.out.println(5 + 7);
      
        /*
        Q: What does this program do? 
        Q: How would we need to change it if we change the numbers? 

        For now, let's just worry about two types of variables
        that each correspond to different kinds of numbers.

        int: integers
        double: real numbers

        Variables have 3 parts: 
        1) type
        2) name
        3) value

        (1) (2)  (3)
        Ex: int num = 37;

        To "make" a variable in Java, we must "declare" and "initialize" it

        declare: Tell Java you are making a certain type of variable with a certain name
        initialize: Give that variable you just declared an initial value

        Q: Which side of the equal sign is declaring, which side is initializing? 

        Variables all need to have different names. We can't have two variables with the same name. 
        You can change the values of variables, we will see this later. 

        Q: Let's practice initializing and declaring a few variables. 
        */

        /*
        1) Printing

        We can print variables, just like we printed "Hello, World!" last class.
        */

        // int age = 5;
        // System.out.println(age); 

        /*
        We can also print multiple things at once.  
        Q: What's going on here?
        A: Java is really smart when it comes to adding "adding" 
        */

        // int month = 3;
        // int day = 1998;
        // System.out.println("My birth month is + " + month);
        // System.out.println("My birth year is + " + day);

        // System.out.println("Hello, " + "World!");

        /*
        2) Arithmetic

        Arithmetic in Java works basically the same as in real life,
        with only a few exceptions. 
        
        Operators:
        +, -, *, /, %, = 
        
        The first thing we need to know is the "=" operator. This is NOT
        an equals sign. It is the assignment operator,
        and it gives the value on the right side of the equal sign
        to the variable on the left. 

        Here are some examples:
        */

        // double a = 3.5; 

        // int result = 5 + 7;
        // System.out.println(result);

        // double result2 = 5.5 + 6.2;
        // System.out.println(result2);

        // int number = 7;
        // number = number * 3;
        // System.out.println(result3);

        // double new_number = 5.1;
        // new_number = new_number * 3;
        // System.out.println(new_number);

        /*
        Division works a little weirdly. If your division includes a double,
        it works as the same as in math.

        If you divide two integers, your result will not include the remainder.

        Ex:
        */

        // int quotient = 5/2;
        // double quotient2 = 5.0 / 2.0;
        // double quotient2 = 5.0 / 2;

        // int remainder = 5 % 2;

        /*
        Let's get some practice.
        Let's write two programs:

        1) Let's write a program that makes two integer variables and adds them
        */

        /*
        2) Now let's write a program that multiples two numbers,
        divides them by a third, and prints the result out! 
        */

        /*
        FAQ:
        Q: Can I save and use variables from one file on another?
        A: No, each individual Java file is it's own program (for now).

        Q: If I run my file once, will the variables be saved for next time?
        A: No, each time you run a file, your program starts as a blank slate

        Q: How do I check or troubleshoot my work?
        A: Run your code! Either on a computer or by hand.
        
        Q: If the = operator is assignment, what operator can compare two things?
        A: We'll learn later! 
        
        Q: Can I use operations I've learned in another computer science in this class?
        A: Not until we go over them as a class.  
        */
    }
  }
