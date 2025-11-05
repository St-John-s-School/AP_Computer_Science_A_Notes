public class e_ArraysAndLoops
{
   public static void main(String[] args)
   {
   /*
   As noted on the previous files, we usually use loops
   hand in hand with arrays. 

   1) Arrays have indices that go up by one
   2) Loops have variables that go up by one

   This alignment means that, usually, we can use
   loops to make, edit, and calculate values associated
   with arrays. This time, i, the loop variable,
   represents the relevant index in an array.
   */   
   
   String[] names = {"Harry Potter", "Ron Weasley", "Hermione Granger"};
   for (int i = 0; i < names.length; i++)
   {
      int index = names[i].indexOf(" ");
      names[i] = names[i].substring(0, index);
      System.out.println(names[i]);
   }

   /*
   There's two big things to notice in the above example.

   1) arrays have a length, but we don't use length()
   like we do for Strings. We just say array.length (with no parentheses).

   This is tricky! 

   2) You can access ("get") OR edit the elements of an array
   using the array[index] syntax. This is super handy in the body of a loop.
   
   */

   }
}
 