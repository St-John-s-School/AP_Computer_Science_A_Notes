/*
This program involves
Scanner AND ArrayLists,
so we import both util.* and io.*
*/

import java.util.*;
import java.io.*;

public class c_ReadingFiles
{
    /*
    Notice the "throws FileNotFoundException". 
    It'll be the same for every program that involves reading
    */
    public static void main(String[] args) throws FileNotFoundException
    {
    /*
    Reading from files uses many familiar Scanner methods.
    
    next(): reads the next token (word)
    nextLine(): reads the entire next line
    nextInt(): reads the next integer
    nextDouble(): reads the next double
    nextBoolean(): reads the next double

    It also uses a few NEW Scanner methods.

    hasNext(): returns true if there's more data to read
    hasNextLine(): returns true if there's another line in the text file

    
    The pattern is usually:
    1) Create a File object with the correct file name
    2) Create a Scanner object pointing to that File object
    3) While there is still data to be read
    4) Read that data in using Scanner methods

    */

    File f = new File("sample.txt");
    Scanner input = new Scanner(f);
    
    while (input.hasNextLine())
    {
        String line = input.nextLine();
        System.out.println(line);
    }
    
    input.close(); 

    // You can close Scanner when you're done with it
    // It's not necessary, but perhaps a nice thing to do... 
    // If you were a robot that had to do everything someone told you to do
    // Wouldn't it be nice if they told you when you could stop working? 

    /*
    Consider the text file "numbers.txt.
    Let's count the number of numbers in numbers.txt

    How might we do that?
    */

    // File numbers = new File("numbers.txt");
    // Scanner numInput = new Scanner(numbers);
    }
}