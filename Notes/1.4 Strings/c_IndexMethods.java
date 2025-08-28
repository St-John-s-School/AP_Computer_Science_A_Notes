public class c_IndexMethods
{
    public static void main(String[] args)
    {
    /*
    We have a few important methods that rely on indices.
    Remember, a method is kind of like a mathematical function.
    It does something to an input.  

    All String methods are going to look like this:
    StringName.methodName(input);

    StringName is the name of the String we want to use this method on.
    */

    /*
    First, we have length()
    the length() method returns (outputs) the number of characters
    in the string.
    */

    String s = "test";
    System.out.println("The number of characters in " + s + " is: " + s.length());

    /*
    Q: length() does not have an input inside the parentheses.
    Why is that?
    */

    /*
    We also have StringName.charAt(index)
    charAt() will output the character found at the input index. 
    */

    // String t = "test";
    // int index = 1;
    // System.out.println("CHARacter AT index " + index + " is: " + t.charAt(index));

    /*
    Finally, we have StringName.indexOf(input)
    This is the String method that returns the index of input in StringName.
    
    Note: If s is not in StringName, then indexOf outputs -1.
    Note: If there are multiple occurences of s in StringName,
    then indexOf() outputs the first occurrence. 
    */

    // String input = "f";
    // String h = "gaffe";
    // int indexOfInput = h.indexOf(input);
    // System.out.println("The index of the first occurrence of " + input +
    // " in " + h + " is: " + indexOfInput);

    /*
    What happens when we search for something that's not there?
    */

    // String i = "gaffe";
    // int notFound = i.indexOf("z");
    // System.out.println("Index of 'z' in " + i + ": " + notFound);

    /*
    Q: How could you always find the first character of a String with charAt()?
    */
    }
}