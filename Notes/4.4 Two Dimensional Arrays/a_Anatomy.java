import java.util.*;

public class a_Anatomy
{
    public static void main(String[] args)
    {
        /*

        We've gotten very good at representing data as lists of things.
        Think of ArrayLists, Arrays, and how we have mastered them...

        Hooray...

        Sometimes, representing data in one dimension just isn't good enough.
        Imagine a seating chart, or a matrix in math, or checkers.

        We need two dimensions to represent the data. 

        Therefore, we need a two-dimensional array.

        IMPORTANT CONCEPT: In Java, a two-dimensional array is
        an ARRAY OF ARRAYS. It is an array whose elements are smaller arrays.

        The syntax for a 2D array is as follows:

        <element_type>[][] <array_name> = new <element_type>[<num_rows>][<num_cols>]; 
        int[][] array = new int[3][4]; // this creates an integer array with 3 rows and 4 columns
                                        0   1   2   3
                                         ┌────────┬────────┬────────┬────────┐
                                       0 │ [0][0] │ [0][1] │ [0][2] │ [0][3] │
                                         ├────────┼────────┼────────┼────────┤
                                       1 │ [1][0] │ [1][1] │ [1][2] │ [1][3] │
                                         ├────────┼────────┼────────┼────────┤
                                       2 │ [2][0] │ [2][1] │ [2][2] │ [2][3] │
                                         └────────┴────────┴────────┴────────┘
          
        We can construct our arrays with initial values much the same way as before
        <element_type>[][] <array_name> = {{<value>, <value>, ..., <value>},
                                          {<value>, <value>, ..., <value>}};
        int[][] array = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        
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
    }

    /*
    NOTE: For those of you who know what a matrix is,
    this seems to be very similar to matrices.
    A i,j is how we represented the element in the i row and j column in a matrix.
    We do the same with A[i][j], but now things are 0-indexed. 

    NOTE: The NUMBER of smaller arrays in the 2D array is the number of rows.
    The NUMBER of elements in those smaller arrays is the number of columns. 
    */

}
