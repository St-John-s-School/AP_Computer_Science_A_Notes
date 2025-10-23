import java.util.Scanner;

public class d_EditingStrings
{
  public static void main(String[] args)
  {
    /*
    Consider this loop, which is meant to remove the spaces from a String.

    Q: What has gone wrong? Why?

    Q: How can we fix this? 

    */

    String s = "this  string   has many    spaces";
    for (int i = 0; i < s.length(); i++)
    {
        if (s.charAt(i) == ' ')
        {
            s = s.substring(0, i) + s.substring(i + 1);
        }
    }
    System.out.println(s);

  }
}



