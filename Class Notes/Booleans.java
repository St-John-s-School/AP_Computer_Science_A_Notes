public class Booleans{
    public static void main(String[] args)
    {
    /* It's time to introduce a new data type, boolean, that will allow us to have logical expressions in our programs. 
    booleans only have two values, true or false
    We can declare booleans as follows: 
    */

    boolean b = true;
    
    // We can also assign booleans values that are the outputs of logical (also known as boolean) expressions:

    // b = (5 % 2 == 1); 
    // System.out.println(b); 

    /* These logical expressions rely on logical operators 
    "==" calculates equality. Things like "2 == 2" evaluate to true. 
    "==" and other operators like ">=" or "<" are relational. 
    "&&" means "and". Things like "2 == 2 && 3 == 3" evaluate to true.
    "||" means "or". Things like "2 == 2 || 2 == 3" evaluate to true. 
    "&&" and "||" are combinational, since they combine other logical expressions.
    "!" means "not". Things like "!(3 == 2)" evaluate to true. ! is unary. 
    We also have relational operators like 
    */ 

    /*We often use venn diagrams to express the outputs of logical operators. 
    These venn diagrams also allow us to visualize De Morgan's Laws
    Simply stated:
    !(p || q) -> !p && !q
    !(p && q) -> !p || !q 
    */ 

    // Let's practice evaluating expressions with logical operators
    // What value is being assigned to c? 
    // int first = 4;
    // int second = -6;
    // int third = 8;

    // boolean c = !(second >= third) && !(first - third == 0);
    }
  }
  
