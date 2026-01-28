import java.util.*;

public class b_Traversal
{
    public static void main(String[] args)
    {
        /*
        Since every element of a two dimensional array has 2 indices,
        will we be able to use a single loop to access all our elements?

        Doubtful.
        */

        /*
        Helpful Hint: If we look at the two indices of an element in a 2D array,
        i, the first index, refers to the row (which smaller array it's in)
        j, the second index, refers to the column (which element in the smaller array it's in)
        */

        /*
        To "get" to elements of a 2D array, we need two loops. 
        The outer loop, which we usually index with i, loops over rows
        The inner loop, which we usually index with j, loops within a row. 
        */

        int[][] array = {{1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9},
                         {10, 11, 12}};

        System.out.println("Rows:" + array.length);
        System.out.println("Columns:" + array[0].length);
        
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        /*
        Q: Why does array[i].length get the num of columns? 

        Q: How many elements does this array have in terms of rows and columns? 
        */
        
    }
}
