/*
Notes Outline:
0) Lab 3 Review
1) Casting
2) Booleans
3) if/then statements
4) Practice
5) Lab 4 Overview
*/

/*
0) Lab 3 Review
*/


public class Logic {
    public static void main(String[] args)
    {
    
    /*
    1) Casting 

    You might be wondering if we know any particularly
    nice ways of turning one variable into another.

    We do!
    Casting is the name for converting variables.
    There's a few ways to do it.
    */

    double a = 10.9;
    int b = (int) a;
    System.out.println(b);

    int f = 5;
    double g = (double) f;
    System.out.println(g);

    /*
    2) Booleans
    
    Booleans are the 5th data type we will learn in this course.
    We have: int, double, String, char, and now booleans.

    Def: Boolean is a data type that only has two values: true or false. 
    Booleans are used to represent the results of logic tests (yes or no questions). 
    They're used to control if/else statements, which we will talk about later today.

    Operators:
    To use booleans effectively, we need to learn a few new operators.

    ==: the double equals sign checks if the two things on either side are equal. If they are,
    it outputs true, and if they aren't, it outputs false.

    &&: The "and" operator combines two logical tests.
    Both need to be true for && to output true.

    !: the "not" operator inverts a single logical test. If the input is false,
    ! outputs true, and vice versa.

    !=: this operator checks if two things are NOT equal. 
    If they aren't, it outputs true. 

    ||: The "or" operator combines two logical test.
    If at least one is true, then || outputs true.  
    */

    // int c = 7;
    // boolean l = (c % 2 == 0);
    // System.out.println("l is: " + l);

    // boolean m = ((5 * 3 == 15) && (6 - 4 == 2));
    // System.out.println("m is: " + m);

    // boolean k = !(Math.pow(4, 2) > 15);
    // System.out.println("k is: " + k);

    /*
    3) if/else statements

    Booleans are useful because they our computers the ability to interpret things
    as either true or false. In the past, we haven't really been able to have our 
    computers work conditionally (do something based on something else being true or false).

    We can imagine this would have been useful on some previous Labs.

    To run code conditionally, we need to use if/else statements.

    Def: An if/else statement is a "control structure".
    If the test in the if() statement is true, then Java will run the code in the body. 
    If it isn't, then Java will run the else statement, if there is one. 

    if (test)
    {
        code that should be run if the test is true;
    }
    else 
    {
        code that should be run if the test isn't true; 
    }
    */

    // int number = 6;
    // if (number % 2 == 0)
    // {
    //     System.out.println(number + " is even");
    // }
    // else
    // {
    //     System.out.println(number + " is odd");
    // }
    
    // String s = "test string";
    // if (s.length() > 7)
    // {
    //     System.out.println(s + " is longer than 7 characters");
    // }
    // else
    // {
    //     System.out.println(s + " is shorter than 7 characters");
    // }

    // String t = "bananas";
    // if (t.charAt(0) == 'a')
    // {
    //     System.out.println(t + " starts with an a");
    // } 
    // else if (t.charAt(0) == 'b')
    // {
    //     System.out.println(t + " starts with a b");
    // }
    // else 
    // {
    //     System.out.println(t  + " starts with something else");
    // }

    // int d = 12;
    // if (d % 2 == 0)
    // {
    //     System.out.println(d + " is divisible by 2");
    // }
    // else if (d % 3 == 0)
    // {
    //     System.out.println(d + " is divisible by 3");
    // }
    // else if (d % 4 == 0)
    // {
    //     System.out.println(d + " is divisible by 4");
    // }

    /*
    4) Practice

    0) Write a program with your tablemates that determines whether an integer is divisible by 2, 3, or both 2 and 3. 
    */

    }
  }

/*
IMPORTANT NOTES:
0) It's going to be important from now on to start caring about indentation.
   You should try to have your brackets that match (start and end of an if statement, etc)
   also match in indentation. 

1) Be careful about if vs. else if
   Generally, use "else if" if there's more than two outcomes to your code.
   You'll gain an intuition for when which is useful as you write more programs.
   For now, a good rule of thumb is that "else if" is useful when there are
   more than two outcomes you want to account for in your code, but you only want
   one of them to be true. 

2) Be very careful about = vs ==!

*/