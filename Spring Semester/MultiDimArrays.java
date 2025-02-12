import java.util.*;

public class MultiDimArrays
{
    public static void main(String[] args)
    {
        //  *
        //  * Often a 1-Dimensional list of information isn't enough we can create 
        //  * arrays with multiple dimensions. This can help us represent more complex
        //  * real world objects such as a grid or a cube. This is achieved in java by
        //  * creating an array of arrays.
        //  * 
        //  * The syntax is simiar to 1-Dimensional array.
        //  * 
        //  * <element_type>[][] <array_name> = new <element_type>[<number_of_rows>][<number_of_columns>]; 
        //  * int[][] array = new int[3][4]; // this creates an integer array with 3 rows and 4 columns
        //  *                                   0   1   2   3
        //  *                                 ┌────────┬────────┬────────┬────────┐
        //  *                               0 │ [0][0] │ [0][1] │ [0][2] │ [0][3] │
        //  *                                 ├────────┼────────┼────────┼────────┤
        //  *                               1 │ [1][0] │ [1][1] │ [1][2] │ [1][3] │
        //  *                                 ├────────┼────────┼────────┼────────┤
        //  *                               2 │ [2][0] │ [2][1] │ [2][2] │ [2][3] │
        //  *                                 └────────┴────────┴────────┴────────┘
        //  * 
        //  * As well we can construct our arrays with initial values much the same way as before
        //  * <element_type>[][] <array_name> = {{<value>, <value>, ..., <value>},
        //  *                                    {<value>, <value>, ..., <value>}};
        //  * int[][] array = {{1, 2, 3},
        //  *                  {4, 5, 6},
        //  *                  {7, 8, 9}};
        //  *  
        //  *

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

}

