import java.util.Arrays;

public class d_SelectionSort
{
    public static void main(String[] args)
    {
    /*
    Now let's move on to sorting. We can see why sorting might be useful
    based on the fact that Binary Search requires a sorted array. 

    The first sorting algorithm we'll learn is selection sort.

    1) Find the smallest element in the array. Swap it into index 0.
    2) Find the smallest element in the REST of the array. Swap it into index 1.
    3) Find the smallest in the rest. Swap it into index 2.
    4) Keep going until the whole array is sorted.

    At each step, we "select" the minimum remaining element
    and put it where it belongs.
    Thus, selection sort. 
    */

    int[] arr = {29, 10, 14, 37, 13};
    System.out.println("Before: " + Arrays.toString(arr));
    selectionSort(arr);
    System.out.println("After:  " + Arrays.toString(arr));

    /*
    How fast is Selection Sort?

    If we have $n$ elements, how many comparisons do we do? 
    */

    }

    public static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}