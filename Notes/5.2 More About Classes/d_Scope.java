public class d_Scope
{
    /*
    Now that we have field variables, static variables, parameters,
    and local variables, it's worth asking: where can each be used?

    The idea of where variables can be used is called "scope."

    We were introduced to scope last semester. We found out that
    parameters stopped existing outside methods, and that variables
    made in loops or if statements stopped existing
    outside those loops or if statements.

    Field / static variables  -> usable anywhere in the class
    Parameters                -> usable only in the method they belong to
    Local variables           -> usable only inside the {} they were declared in
    */

    /*
    Sometimes we get lazy and give variables the same name.
    It turns out this usually doesn't work, except in one circumstance.

    What if our parameter and field variable have the same name? 

    The parameter takes precedence. Therefore, in the code below,
    the field variable name never gets set. 

    public class Dog
    {
        private String name;

        public Dog(String name)
        {
            name = name; 
                          
        }
    }

    The fix is to use "this". "this" refers to the CURRENT object.

    public Dog(String name)
    {
        this.name = name;
        // this.name = field variable, name = parameter
    }
    */

    /*
    Q: When is "this" necessary?

    When there is ambiguity to either:
    - which variable we're referring to (parameter name or field variable name)
    - which object we are referring to 
      (the Object we're currently inside or the parameter Object)

    When there is no ambiguity, "this" is optional:

    public void depositMoney(double amount)
    {
        balance = balance + amount;         // fine
        this.balance = this.balance + amount; // also fine
    }

    */

    /*
    Q: Can static methods use this? 

    */
}