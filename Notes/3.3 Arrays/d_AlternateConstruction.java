 public class d_AlternateConstruction
 {
    public static void main(String[] args)
    {
    /*
    There's another way to make an array.
    This alternate construction relies on you already
    knowing the values you want to put in the array.

    We can initialize arrays when we construct (declare) them, writing: 
    <element_type>[] <array_name> = {<value>, <value>, ..., <value>};
    */
    
    String[] names = {"Chidsey", "Taub", "Hoodwink", "Claremont", "Mulligan", "Winston"};

    for (int i = 0; i < 6; i++)
    {
        System.out.println(names[i]);
    }

    /*
    Q: Did we need to specify the length of this array? 

    Q: Why might this approach be superior? 

    Q: What is our loop doing each time it runs? 
    
    */

    }
 }