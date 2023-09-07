public class Casting{
    public static void main(String[] args)
    {
    /* When wanting to change the type of data we have we must perform an operation called casting.
       Casting comes in two forms: explicit and implicit casting.
    */
    
    /* Exlicit casting allows us to control what type of data a number will be.
       Using paratheses we define what kind of data we would like to cast to.
    */

    // Cast a double to an integer
    // Example:
    // int number = (int) 3.8;
    // System.out.println("The casted number is " + number);
        
    // Take note that casting does not round but instead truncates
        
    // Cast an integer to a double
    // Example:
    // double number = (double) 5;
    // System.out.println("The casted number is " + number);
        
    // This only adds on a .0 to the integer number

    // The order of explicit casting is performed before any algebraic operations are performed
    // Example:
    // int number = (int)(3.6 + 2.5);
    // System.out.println("The casted number is " + number);  
    // number = (int)3.6 + (int)2.5;
    // System.out.println("The casted number is " + number);

    // Note the order of operations 

    /*  Implicit casting is not something you directly control as it is performed by the Java compiler.
        This is done when there is a type mismatch in an equation and it is possible to cast one of the operands
        without any loss of information.
    */

    // Cast an integer to a double
    // Example:
    // double number = 5;
    // System.out.println("The casted number is " + number);
        
    // Note this is the same as the explicit example because the compiler can simply add a .0 without losing information
        
    // Cast an integer to a double
    // Example:
    // double number = 5/2;
    // System.out.println("The casted number is " + number);
    // number = 5.0/2;
    // System.out.println("The casted number is " + number);
    // number = 5.0/2.0;
    // System.out.println("The casted number is " + number);

    // Note when the inplicit casting happens and that as long as one of the two operands is a double the other 
    // will be casted to perform a more accurate calculation
    }
  }
  
