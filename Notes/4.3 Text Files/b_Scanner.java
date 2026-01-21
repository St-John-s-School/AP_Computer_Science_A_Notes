import java.util.*;
import java.io.*;

public class b_Scanner
{
    public static void main(String[] args) throws FileNotFoundException
    {
    /*
    It turns out that we can read text files in Java with Scanner
    (the same Scanner we were using to read user inputs)

    In addition to Scanner, we need to have a File object.
    One File object represents an actual text file. 

    */

    /*
    Before we start, there are some important notes:
    
    1) You need to import the file classes with:
       import java.io.*;
    
    2) File operations can fail 
       Because of that, we need to write code to handle potential errors
       These are called "throw" commands
    
    3) For these programs to work, the file needs to be in the same folder
       as the program using that file. We also need to know the file name.
    */

    /*
    To create a File object that points to a file, we write:

    File f = new File("filename.txt");
    
    This doesn't create the actual file yet. It just creates an object
    that represents where the file is on your computer. 
    
    To read from this file, we "point" our Scanner to it:
    Scanner input = new Scanner(f);
    
    We used to write (System.in) as the input into the Scanner constructor.
    Now we write the name of the File object because that's where
    we want the Scanner to read inputs from. 
    */

    }
}
